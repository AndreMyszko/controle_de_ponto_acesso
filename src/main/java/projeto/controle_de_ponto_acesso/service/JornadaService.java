package projeto.controle_de_ponto_acesso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.controle_de_ponto_acesso.model.JornadaTrabalho;
import projeto.controle_de_ponto_acesso.repository.JornadaRepository;

@Service
public class JornadaService {
    
    JornadaRepository jornadaRepository;
    
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    
}
