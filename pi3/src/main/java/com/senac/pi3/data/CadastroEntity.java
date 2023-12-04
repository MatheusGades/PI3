package com.senac.pi3.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity 
@Table(name="cadastro") 
public class CadastroEntity {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id; 
    private String nome; 
    private String cpf; 
    private String email; 
    private String endereco;
    private String telefone; 
}
