package com.github.jntakpe.asyncsv;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author jntakpe
 */
@Service
public class CsvUploadService {

    @Async
    CompletableFuture<String> uploadCsv() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Ce code est executé en parallèle là 5 sec plus tard");
        return CompletableFuture.completedFuture("chemin_de_mon_fichier.txt");
    }

}
