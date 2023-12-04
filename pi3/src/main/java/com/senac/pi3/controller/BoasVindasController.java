package com.senac.pi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoasVindasController {
    
    //Metodo para exibir no navegador 
   @RequestMapping("/BoasVindas") 
   public String preferencias(){ 
       return "telaBoasVindas"; 
   }
}
