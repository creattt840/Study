package embedding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmbeddingSearchDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.初始化EmbeddingClient
        String apiKey="sk-48c36ec3980449f4b50365159421f58c";
        EmbeddingClient client = new EmbeddingClient(apiKey);

        //2.准备知识库的chunks(模拟前两篇分块+元数据的结果)
        List<Map<String,Object>> chunks = new ArrayList<>();

        chunks.add(Map.of(
                "content", "自签收之日起 7 天内，商品未经使用且不影响二次销售的，消费者可申请七天无理由退货。",
                "metadata", Map.of("doc_id", "policy_001", "title", "退货政策")
        ));
        chunks.add(Map.of(
                "content", "退货运费由消费者承担，如商品存在质量问题则由商家承担运费。",
                "metadata", Map.of("doc_id", "policy_001", "title", "退货政策")
        ));
        chunks.add(Map.of(
                "content", "订单发货后，物流信息将在 24 小时内更新。消费者可在订单详情页查看实时物流状态。",
                "metadata", Map.of("doc_id", "logistics_001", "title", "物流说明")
        ));
        chunks.add(Map.of(
                "content", "会员积分可在结算时抵扣现金，100 积分等于 1 元，每笔订单最多抵扣 50%。",
                "metadata", Map.of("doc_id", "member_001", "title", "会员权益")
        ));
        chunks.add(Map.of(
                "content", "生鲜类商品不支持七天无理由退货，签收后如有质量问题请在 48 小时内联系客服。",
                "metadata", Map.of("doc_id", "policy_002", "title", "生鲜退货政策")
        ));

        //3.批量向量化所有chunks
        List<String> chunkTexts = new ArrayList<>();
        for (Map<String, Object> chunk : chunks) {
            chunkTexts.add((String) chunk.get("content"));
        }

        System.out.println("正在向量化 " + chunkTexts.size() + " 个 chunks...");
        List<double[]> vectors = client.embed(chunkTexts);
        System.out.println("向量化完成，每个向量的维度：" + vectors.get(0).length);

        //4.用户提问
        String query="买了一周的东西还能退吗";
        System.out.println("\n用户提问："+query);

        //5.将用户的问题也向量化了
        double[] queryVector = client.embed(query);

        //6.计算query和每个chunk的相似度
        System.out.println("\n----相似度排名----");
        List<Map<String,Object>> results = new ArrayList<>();

        for (int i = 0; i < chunks.size(); i++) {
            //余弦相似度对比
            double calculate = CosineSimilarity.calculate(queryVector, vectors.get(i));
            HashMap<String, Object> result = new HashMap<>();
            result.put("index",i);
            result.put("content",chunks.get(i).get("content"));
            result.put("metadata",chunks.get(i).get("metadata"));
            result.put("similarity",calculate);
            results.add(result);
        }

        results.sort((a,b)->Double.compare(
                (double) b.get("similarity"),
                (double) a.get("similarity")
        ));

        //7.输出结果
        for (int i = 0; i < results.size(); i++) {
            Map<String, Object> r = results.get(i);
            Map<String, Object> meta = (Map<String, Object>) r.get("metadata");
            System.out.printf("Top-%d [相似度: %.4f] [来源: %s]%n",
                    i + 1,
                    (double) r.get("similarity"),
                    meta.get("title"));
            System.out.println("  内容: " + r.get("content"));
            System.out.println();
        }
    }
}
