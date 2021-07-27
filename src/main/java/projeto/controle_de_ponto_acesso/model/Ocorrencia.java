package projeto.controle_de_ponto_acesso.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class Ocorrencia {
    private Long id;
    private String nome;
    private String descricao;
}