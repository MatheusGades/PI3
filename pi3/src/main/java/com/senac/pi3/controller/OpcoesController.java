package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OpcoesController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/opcoes")
    public String exibirTelaOpcoes() {
        return "telaOpcoes";
    }
}
