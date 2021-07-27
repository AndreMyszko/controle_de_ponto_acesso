package projeto.controle_de_ponto_acesso.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class JornadaTrabalho {
    private Long id;
    private String descricao; 
}
