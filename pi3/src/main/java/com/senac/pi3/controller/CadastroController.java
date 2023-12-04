
package com.senac.pi3.controller;

import com.senac.pi3.data.CadastroEntity;
import com.senac.pi3.service.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {
    @Autowired
    CadastroService cadastroService;
    
    @GetMapping("/cadastramento")
    public String criarCadastro(Model model) {
      CadastroEntity cad = new CadastroEntity();
      model.addAttribute("cliente", cad);
      return "cadastroCliente";
    }
    
    @PostMapping("/salvarCadastro")
    public String salvarCadastro(@Valid @ModelAttribute("cliente") CadastroEntity cad, BindingResult result) {
        if (cad.getId() == null) {
            cadastroService.criarCadastro(cad);
        } else {
            cadastroService.atualizarCadastro(cad.getId(), cad);
        }
        return "exibir-cadastro";
    }
    
}
