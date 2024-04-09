package dev.vanderloureiro.springlab.interceptor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo-interceptor")
public class ExemploInterceptorController {

    @GetMapping
    public ResponseEntity<String> executa() {
        return ResponseEntity.ok("Hello World!");
    }
}
