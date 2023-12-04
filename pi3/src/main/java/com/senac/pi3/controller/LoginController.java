package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/login")
    public String exibirLoginFuncionario() {
        return "loginFuncionario";
    }
}
