package io.resman.resman.controllers;

import io.resman.resman.models.QRCodeGenerator;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class QRCodeController {
    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @GetMapping(value = "/genrateAndDownloadQRCode")
    public void download(@RequestParam(value = "url", defaultValue = "World") String codeText) throws Exception {
        QRCodeGenerator.generateQRCodeImage(codeText, 300, 300, QR_CODE_IMAGE_PATH);
    }

//    @GetMapping(value = "/genrateQRCode")
//    public String generateQRCode(@RequestParam(value = "url", defaultValue = "World") String codeText) throws Exception {
//        String encoded = Base64.getEncoder().encodeToString(QRCodeGenerator.getQRCodeImage(codeText, 300, 300));
//        return encoded;
//    }

    @GetMapping(value="/genrateQRCode")
    public String generateQRCode(@RequestParam(value = "url", defaultValue = "World") String codeText) throws Exception {
        String encoded = Base64.getEncoder().encodeToString(QRCodeGenerator.getQRCodeImage(codeText, 300, 300));
        String output = encoded;
        JSONObject outputJsonObj = new JSONObject();
        outputJsonObj.put("qrCode", output);
        return outputJsonObj.toString();
    }
}

