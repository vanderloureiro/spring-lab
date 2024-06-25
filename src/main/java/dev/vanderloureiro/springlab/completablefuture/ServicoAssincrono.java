package dev.vanderloureiro.springlab.completablefuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ServicoAssincrono {

    private final Logger log = LogManager.getLogger();

    @Async
    public CompletableFuture<String> executa(Integer id) {
        try {
            log.info("Iniciando processamento: {}", id);
            Thread.sleep(1000L);
            log.info("Finalizando processamento: {}", id);
            return CompletableFuture.completedFuture("Sucesso! Processo: " + id);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
