package Model;

import javax.swing.JOptionPane;

public class ClasseX_DAO {

    public static double valor1, valor2, resul;

    public static void Soma() {
        String x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor2 = Double.parseDouble(x);
        resul = valor1 + valor2;
        JOptionPane.showMessageDialog(null, valor1 + " " + Model.Tela_DAO.operador + " " + valor2 + " = " + resul);
    }

    public static void Sub() {
        String x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor2 = Double.parseDouble(x);
        resul = valor1 - valor2;
        JOptionPane.showMessageDialog(null, valor1 + " " + Model.Tela_DAO.operador + " " + valor2 + " = " + resul);
    }

    public static void Multi() {
        String x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor2 = Double.parseDouble(x);
        resul = valor1 * valor2;
        JOptionPane.showMessageDialog(null, valor1 + " " + Model.Tela_DAO.operador + " " + valor2 + " = " + resul);
    }

    public static void Div() {
        String x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor1 = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
        valor2 = Double.parseDouble(x);
        resul = valor1 / valor2;
        JOptionPane.showMessageDialog(null, valor1 + " " + Model.Tela_DAO.operador + " " + valor2 + " = " + resul);
    }
}
