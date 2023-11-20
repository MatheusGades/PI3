package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinalizacaoController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/finalizacao")
    public String exibirTelaFinalizacao() {
        return "telaFinalizacao";
    }
}
