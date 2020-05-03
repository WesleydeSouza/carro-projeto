package wesley.leonardo3.carro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wesley.leonardo3.carro.model.Carro;

import java.util.ArrayList;
@RestController
public class CarroController {

    @GetMapping("/carro")
    public Carro getCarro() {

        Carro carro = new Carro();

        carro.setMarca("Chevrolet");
        carro.setModelo("Corsa");
        carro.setAno("1999/2000");
        carro.setCor("Branco");

        return carro;
    }
    @GetMapping("/cadastros")
    public ArrayList<Carro> getCadastros(){

        Carro carro1 = new Carro();

        carro1.setMarca("Chevrolet");
        carro1.setModelo("Corsa");
        carro1.setAno("1999/2000");
        carro1.setCor("Branco");

        Carro carro2 = new Carro();

        carro2.setMarca("Chevrolet");
        carro2.setModelo("Celta");
        carro2.setAno("2005/2006");
        carro2.setCor("Prata");

        Carro carro3 = new Carro();

        carro3.setMarca("Wolksvagem");
        carro3.setModelo("Gol");
        carro3.setAno("2000/2001");
        carro3.setCor("Vermelho");

        Carro carro4 = new Carro();

        carro4.setMarca("Wolksvagem");
        carro4.setModelo("Fox");
        carro4.setAno("2015/2016");
        carro4.setCor("Preto");

        Carro carro5 = new Carro();

        carro5.setMarca("Fiat");
        carro5.setModelo("Uno");
        carro5.setAno("1999/2000");
        carro5.setCor("Branco");

        Carro carro6 = new Carro();

        carro6.setMarca("Ford");
        carro6.setModelo("Ka");
        carro6.setAno("2020");
        carro6.setCor("Vermelho");

        ArrayList<Carro> cadastro = new ArrayList<>();

        cadastro.add(carro1);
        cadastro.add(carro2);
        cadastro.add(carro3);
        cadastro.add(carro4);
        cadastro.add(carro5);
        cadastro.add(carro6);


        return cadastro;
    }


}
