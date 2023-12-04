package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinalizacaoController {
    
    @GetMapping("/finalizacao")
    public String exibirLoginFuncionario() {
        return "telaFinalizacao";
    }
}
