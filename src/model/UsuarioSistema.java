
package model;

public class UsuarioSistema extends Funcionario{
    
    private String email;
    private String senha;
    private String perfilUsuario;

    public UsuarioSistema() {
    }

    public UsuarioSistema(String email, String senha, String perfilUsuario, String nome, String cpf) {
        super(nome, cpf);
        this.email = email;
        this.senha = senha;
        this.perfilUsuario = perfilUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(String perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }
    
}
