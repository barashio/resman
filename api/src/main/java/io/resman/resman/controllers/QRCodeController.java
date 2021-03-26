package io.resman.resman.controllers;

import io.resman.resman.models.QRCodeGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController
public class QRCodeController {
    private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/QRCode.png";

    @GetMapping(value = "/genrateAndDownloadQRCode")
    public void download(@RequestParam(value = "codeText", defaultValue = "World") String codeText) throws Exception {
        QRCodeGenerator.generateQRCodeImage(codeText, 300, 300, QR_CODE_IMAGE_PATH);
    }

    @GetMapping(value = "/genrateQRCode")
    public String generateQRCode1(@RequestParam(value = "codeText", defaultValue = "World") String codeText) throws Exception {
        String encoded = Base64.getEncoder().encodeToString(QRCodeGenerator.getQRCodeImage(codeText, 300, 300));
        return encoded;
    }
}

