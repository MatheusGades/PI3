package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SistemaController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/sistema")
    public String exibirTelaSistema() {
        return "telaSistema";
    }
}
