
package controller;

import model.UsuarioSistema;
import static view.TelaLoginFuncionario.*;

public class LoginDados {
    
    UsuarioSistema usuario = new UsuarioSistema();
    
    public void dadosArmazenados(){
        
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setPerfilUsuario(txtPerfil.getText());
        
    }
}
