package tika.DTO;

import lombok.Data;

import java.util.Map;

/**
 * 文档解析结果
 */
@Data
public class parseResult {

    /**
     * 是否解析成功
     */
    private boolean success;

    /**
     * 检测到的MIME类型
     */
    private String mimeType;

    /**
     * 提取的文本内容
     */
    private String content;

    /**
     * 提取的元数据
     */
    private Map<String,String> metadata;

    /**
     * 文本长度（字符数）
     */
    private int contentLength;

    /**
     * 错误信息（如果失败）
     */
    private String errorMessage;

    //静态工厂方法
    public static parseResult success(String mimeType,String content,Map<String ,String> metadata){
        parseResult result=new parseResult();
        result.setSuccess(true);
        result.setMimeType(mimeType);
        result.setContent(content);
        result.setContentLength(content!=null?content.length():0);
        result.setMetadata(metadata);
        return result;
    }

    public static parseResult failure(String errorMessage){
        parseResult result = new parseResult();
        result.setSuccess(false);
        result.setErrorMessage(errorMessage);
        return result;
    }
}
