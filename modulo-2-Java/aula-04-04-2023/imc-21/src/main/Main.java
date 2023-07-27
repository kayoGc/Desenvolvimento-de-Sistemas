
package main;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        String sPeso = JOptionPane.showInputDialog("Digite o peso");
        double peso = Double.parseDouble(sPeso);
        
        String sAltura = JOptionPane.showInputDialog("Digite a altura");
        double altura = Double.parseDouble(sAltura);
        
        double Imc = (peso / (altura * altura));
        
        if (Imc < 18.5) {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Abaixo do peso", Imc));
        } else if (Imc <= 24.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Peso normal", Imc));
        } else if (Imc <= 29.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Sobre peso", Imc));
        } else if (Imc <= 34.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Obesidade leve", Imc));
        } else if (Imc <= 39.9) {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Obesidade moderada", Imc));
        } else {
            JOptionPane.showMessageDialog(null, String.format("IMC:%.1f, Obesidade mórbida", Imc));
        }
    }   
    
}
