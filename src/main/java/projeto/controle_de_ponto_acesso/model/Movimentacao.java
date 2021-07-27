package projeto.controle_de_ponto_acesso.model;

import lombok.*;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private Long idMovimento;
        private Long idUsuario;
    }
    
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
    
}
