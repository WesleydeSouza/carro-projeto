package wesley.leonardo3.carro.model;

import lombok.*;

/**
 @author Wesley de Souza e Leonardo Santos
 @since 03/05/2020 14:20
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

    @Getter @Setter
    private String marca;
    @Getter @Setter
    private String modelo;
    @Getter @Setter
    private String ano;
    @Getter @Setter
    private String cor;
}


