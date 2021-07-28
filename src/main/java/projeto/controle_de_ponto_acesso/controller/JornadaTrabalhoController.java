package projeto.controle_de_ponto_acesso.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
