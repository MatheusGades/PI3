/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    public Connection getConexao() {
            
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vendas_automoveis","root","12345");
        return conn;

    } catch (Exception e) {
        System.out.println("Erro ao conectar: " + e.getMessage());
        return null;
    }
}
    public void desconectar(Connection conn) {
      try {
          if (conn != null && !conn.isClosed()) {
              conn.close();
              System.out.println("Voce se desconectou do banco de dados.");
          }
      } catch (SQLException ex) {
          System.out.println("Nao foi possivel desconectar do banco dados.");
      }
  }
}
