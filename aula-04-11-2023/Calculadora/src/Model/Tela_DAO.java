package Model;

import javax.swing.JOptionPane;

public class Tela_DAO {

    public static String operador;

    public static void solicitaOperador() {
        operador = JOptionPane.showInputDialog(null, "Olá, Somos Kayo e Murilo.\nEscolha a operação para realizar a conta");
        if (operador.equals("+")) {
            Model.ClasseX_DAO.Soma();
        } else if (operador.equals("-")) {
            Model.ClasseX_DAO.Sub();
        } else if (operador.equals("*")) {
            Model.ClasseX_DAO.Multi();
        } else if (operador.equals("/")){
            Model.ClasseX_DAO.Div();
        } else {
            JOptionPane.showMessageDialog(null, "Operador inválido");
        }
    }
}
