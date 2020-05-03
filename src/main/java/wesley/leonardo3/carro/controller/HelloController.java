package wesley.leonardo3.carro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String mensagem() {
        return "Seja Bem-Vindo!";
    }
}
