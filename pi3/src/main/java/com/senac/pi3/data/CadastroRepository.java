
package com.senac.pi3.data;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository
public interface CadastroRepository extends JpaRepository<CadastroEntity, Integer> {
    
}
