package projeto.controle_de_ponto_acesso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.controle_de_ponto_acesso.model.JornadaTrabalho;
import projeto.controle_de_ponto_acesso.service.JornadaService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {
    
    @Autowired
    JornadaService jornadaService; 

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public Optional<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada){
        return jornadaService.getById(idJornada);
    }
    
    @DeleteMapping("/{idJornada}")
    public String deleteJornada(@PathVariable("idJornada") Long idJornada){
        return jornadaService.deletejornada(idJornada);
    }
}
