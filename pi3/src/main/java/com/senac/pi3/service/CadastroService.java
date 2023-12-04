
package com.senac.pi3.service;

import com.senac.pi3.data.CadastroEntity;
import com.senac.pi3.data.CadastroRepository;
import com.senac.pi3.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

@Service

public class CadastroService {
   
        
    @Autowired
    CadastroRepository cadastroRepository;
    
    public CadastroEntity criarCadastro(CadastroEntity cad) { 

      cad.setId(null); 
      cadastroRepository.save(cad); 
      return cad; 

   }
    
public CadastroEntity atualizarCadastro(Integer cadId, CadastroEntity cadastroRequest) { 

      CadastroEntity cad = getCadastroId(cadId); 

      cad.setNome(cadastroRequest.getNome()); 

      cad.setCpf(cadastroRequest.getCpf()); 

      cad.setEmail(cadastroRequest.getEmail()); 

      cad.setEndereco(cadastroRequest.getEndereco()); 
      
      cad.setTelefone(cadastroRequest.getTelefone()); 

      cadastroRepository.save(cad); 

      return cad; 

    } 

public CadastroEntity getCadastroId(Integer cadId) { 
      
      return cadastroRepository.findById(cadId).orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado " + cadId));
      
   } 
}
