
package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {
    
    //Metodo para exibir no navegador 
    @GetMapping("/cadastro")
    public String exibirCadastroCliente() {
        return "cadastroCliente";
    }
}
