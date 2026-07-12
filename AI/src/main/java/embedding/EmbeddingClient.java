package embedding;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmbeddingClient {

    private static final String API_URL="https://dashscope.aliyuncs.com/compatible-mode/v1/embeddings";
    private static final String MODEL="text-embedding-v4";

    private final String apikey;
    private final HttpClient httpclient;
    private final ObjectMapper objectMapper;

    public EmbeddingClient(String apikey) {
        this.apikey = apikey;
        this.httpclient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }


    /**
     * 将一组文本转换成向量
     * @param texts
     * @return
     */
    public List<double[]> embed(List<String> texts) throws IOException, InterruptedException {
        //构造请求体
        HashMap<String, Object> requestbody = new HashMap<>();
        requestbody.put("model",MODEL);
        requestbody.put("input",texts);
        requestbody.put("encoding_format","float");

        String jsonBody=objectMapper.writeValueAsString(requestbody);

        //创建完整请求
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("Authorization", "Bearer" + apikey)
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        //发送请求
        HttpResponse<String> response = httpclient.send(request,HttpResponse.BodyHandlers.ofString());

        if (response.statusCode()!=200){
            throw new RuntimeException("API调用失败，状态码："+response.statusCode()
            +",响应："+response.body());
        }

        //解析响应，提取向量
        JsonNode root = objectMapper.readTree(response.body());
        JsonNode dataArray = root.get("data");

        List<double[]> embeddings = new ArrayList<>();
        for (JsonNode item : dataArray) {
            //获取当前节点的向量数据
            JsonNode embeddingNode = item.get("embedding");
            //创建一个数组来存向量数据
            double[] vector=new double[embeddingNode.size()];
            for (int i = 0; i < embeddingNode.size(); i++) {
                vector[i]=embeddingNode.get(i).asDouble();
            }
            //完成一块向量的数组，然后添加到集合中
            embeddings.add(vector);
        }
        return embeddings;
    }

    /**
     * 将单段文本转成向量
     * @param text
     * @return
     */
    public double[] embed(String text) throws IOException, InterruptedException {
        return embed(List.of(text)).get(0);
    }
}
