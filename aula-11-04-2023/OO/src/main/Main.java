
package main;

import javax.swing.JOptionPane;

public class Main {

  
    public static void main(String[] args) {
        Model.Mensagem_DAO.mostra();
        Model.Mensagem_DAO.mostra2();
        
        JOptionPane.showMessageDialog(null, Model.Mensagem_DAO.teste);
        
        Model.Contas_DAO.soma();
    }
    
}
