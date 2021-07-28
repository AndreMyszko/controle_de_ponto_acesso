package projeto.controle_de_ponto_acesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.controle_de_ponto_acesso.model.JornadaTrabalho;

public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    
}
