package tika.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import tika.DTO.parseResult;
import tika.service.TikaParseService;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    private TikaParseService tikaParseService;

    /**
     * 解析上传的文档，返回文本和元数据
     * @param file
     * @return
     */
    @PostMapping(value="/parse",consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<parseResult> parseDocument(@RequestParam("file")MultipartFile file){
        parseResult result = tikaParseService.parseFile(file);

        if (result.isSuccess()){
            return ResponseEntity.ok(result);
        }else{
            return ResponseEntity.badRequest().body(result);
        }
    }

    /**
     * 仅检测文件的MIME类型
     * @param file
     * @return
     */
    @PostMapping(value="/detect",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Map<String,String>> detectMimeType(@RequestParam("file") MultipartFile file){
        try {
            String mimeType= tikaParseService.detectMimeType(file);

            HashMap<String, String> response = new HashMap<>();
            response.put("filename",file.getOriginalFilename());
            response.put("mimeType",mimeType);
            response.put("size",String.valueOf(file.getSize()));
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            HashMap<String, String> error = new HashMap<>();
            error.put("error","无法检测文件类型："+e.getMessage());
            return ResponseEntity.badRequest().body(error);
        }
    }
}
