package projeto.controle_de_ponto_acesso.model;

import javax.persistence.OneToMany;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
