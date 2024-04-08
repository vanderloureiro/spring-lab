package dev.vanderloureiro.springlab.completablefuture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo-complatable-future")
public class Controller {

    private final ServicoAssincrono servicoAssincrono;

    Controller(ServicoAssincrono servicoAssincrono) {
        this.servicoAssincrono = servicoAssincrono;
    }
}
