
package model;

import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    private Conexao conexao;
    private Connection conn;
    
    public ClienteDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
        public void cadastrar(Cliente cliente) {
        String sql = ("INSERT INTO cliente(nome, data_nascimento, cpf, endereco, telefone, email) VALUES(?,?,?,?,?,?)");
        try {

            PreparedStatement st = this.conn.prepareStatement(sql);
            st.setString(1, cliente.getNome());
            st.setString(2, cliente.getData());
            st.setString(3, cliente.getCpf());
            st.setString(4, cliente.getEndereco());
            st.setString(5, cliente.getTelefone());
            st.setString(6, cliente.getEmail());
            st.execute();

        } catch (Exception e) {
            System.out.println("Erro ao realizar o cadastar: " + e.getMessage());
        }
    }
        
        public List<Cliente> getCliente(String nome) {
        String sql = ("SELECT * FROM Cliente WHERE nome LIKE ?");

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);

            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();

            List<Cliente> listaCliente = new ArrayList<>();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setNome(rs.getString("nome"));
                cliente.setData(rs.getString("data_nascimento"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                
                listaCliente.add(cliente);
            }
            return listaCliente;

        } catch (Exception e) {
            return null;
        }
    }
}