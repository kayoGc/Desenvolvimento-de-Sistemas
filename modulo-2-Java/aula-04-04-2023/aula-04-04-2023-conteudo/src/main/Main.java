package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String x = JOptionPane.showInputDialog(null, "Digite um valor");
        
        // int valor = Integer.parseInt(x);
        double valor2 = Double.parseDouble(x);
            // esse valor é inteiro?
        
        JOptionPane.showMessageDialog(null, "O valor digitado foi " + valor2, "", 1);
    }
}
