
package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaidaController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/sair")
    public String exiesbirTelaOpcoes() {
        return "saida";
    }
}
