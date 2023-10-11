
package controller;

import javax.swing.JOptionPane;

public class ValidarCampos {
    
     public boolean validarCPF(String cpf) {
        boolean valido = true;
        boolean valCpf = cpf.matches("[0-9]{11}");
        if (valCpf == false) {
            JOptionPane.showMessageDialog(null, "Por favor informar o cpf com apenas numeros até 11 digitos e sem usar ponto e traço");
            valido = false;
        }
        return valido;
    }

    public boolean validarEmail(String email) {
        boolean valido = true;
        boolean valEmail = email.matches("\\w+@\\w+\\.\\w{2,3}|\\w+@\\w+\\.\\w{2,3}.\\w{2,3}");
        if (valEmail == false) {
            JOptionPane.showMessageDialog(null, "Favor incluir a email no formato "
                    + "válido. nome@dominio.com.br");
            valido = false;
        }
        return valido;
    }

    public boolean validarTelefone(String telefone) {
        boolean valido = true;
        boolean valTelefone = telefone.matches("[(][0-9]{2}[)][0-9]{5}[-][0-9]{4}");
        if (valTelefone == false) {
            JOptionPane.showMessageDialog(null, "Favor incluir o telefone no formato "
                    + "válido. (00)00000-0000");
            valido = false;
        }
        return valido;
    }
    public boolean validarData(String data) {
        boolean valido = true;
        boolean valData = data.matches("[0-9]{4}[/][0-9]{2}[/][0-9]{2}");
        if (valData == false) {
            JOptionPane.showMessageDialog(null, "Favor incluir a data no formato "
                    + "válido. (YYYY/MM/DD)");
            valido = false;
        }
        return valido;
    }
}
