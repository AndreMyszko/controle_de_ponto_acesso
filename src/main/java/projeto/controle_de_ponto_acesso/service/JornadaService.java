package projeto.controle_de_ponto_acesso.service;

import java.util.List;
import java.util.Optional;

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
    
    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }
    
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }
    
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    
    public String deletejornada(Long idJornada) {
        String id = idJornada.toString();
        jornadaRepository.deleteById(idJornada);
        System.out.println("deleted - " + id);
        return "deleted - " + id;
    }
}
