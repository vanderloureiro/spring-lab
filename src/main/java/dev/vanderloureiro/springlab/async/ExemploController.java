package dev.vanderloureiro.springlab.async;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo-async")
public class ExemploController {

    @Autowired
    private ExemploService exemploService;
    private final Logger log = LogManager.getLogger();

    @GetMapping
    public ResponseEntity<String> get() {
        exemploService.processaRequisicao();
        log.info("Retornando ao usuário");
        return ResponseEntity.ok("Processado com sucesso");
    }


}
