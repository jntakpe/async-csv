package com.github.jntakpe.asyncsv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jntakpe
 */
@RestController
public class CsvUploadController {

    private final CsvUploadService csvUploadService;

    public CsvUploadController(CsvUploadService csvUploadService) {
        this.csvUploadService = csvUploadService;
    }

    @GetMapping("/upload")
    public String upload() throws InterruptedException {
        csvUploadService.uploadCsv();
        return "la direct tu retournes ce que tu veux";
    }

}
