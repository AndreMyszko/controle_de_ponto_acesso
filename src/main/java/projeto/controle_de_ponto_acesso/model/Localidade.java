package projeto.controle_de_ponto_acesso.model;

import javax.persistence.ManyToOne;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
