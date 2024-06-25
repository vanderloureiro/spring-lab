package dev.vanderloureiro.springlab.completablefuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/exemplo-completable-future")
public class Controller {

    private final Logger log = LogManager.getLogger();
    private final ServicoAssincrono servicoAssincrono;

    Controller(ServicoAssincrono servicoAssincrono) {
        this.servicoAssincrono = servicoAssincrono;
    }

    @GetMapping
    public void executa() throws ExecutionException, InterruptedException {
        CompletableFuture<String> s1 = servicoAssincrono.executa(1);
        CompletableFuture<String> s2 = servicoAssincrono.executa(2);
        CompletableFuture<String> s3 = servicoAssincrono.executa(3);

        CompletableFuture.allOf(s1, s2, s3).join();
        log.info(s1.get());
        log.info(s2.get());
        log.info(s3.get());
    }
}
