package Model;

import javax.swing.JOptionPane;

public class lista_DAO {
    public static void exc001() {
        double [] vetor = new double[10];
        double negativo=0, positivos=0;
        for (int cont = 0; cont < 10; cont++) {
            String x = JOptionPane.showInputDialog(null, "Digite um número "  + cont + ":");
            vetor[cont] = Double.parseDouble(x);
            
            if (vetor[cont] < 0) {
                negativo++;
            } else {
                positivos += vetor[cont];  
            }
        }
        
        JOptionPane.showMessageDialog(null, "A quantidade de negativos é: " + negativo);
        JOptionPane.showMessageDialog(null, "A soma dos positvios é: " + positivos);
     }
    
    public static void exc002() {
        double [] vetor = new double[5];
        double negativo=0, positivos=0;
        for (int cont = 0; cont < 5; cont++) {
            String x = JOptionPane.showInputDialog(null, "Digite um número "  + cont + ":");
            vetor[cont] = Double.parseDouble(x);
            
            if (vetor[cont] >= 0) {
                JOptionPane.showMessageDialog(null, "O número " + vetor[cont]+"é positivo");
            }
        }
    }
    
    public static void exc003() {
        double [] vetor = new double[7];
        double negativo=0, positivos=0;
        for (int cont = 0; cont < 7; cont++) {
            String x = JOptionPane.showInputDialog(null, "Digite um número "  + cont + ":");
            vetor[cont] = Double.parseDouble(x);
            
            if (vetor[cont] % 2 == 0 && vetor[cont] % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + vetor[cont]+" é multiplo de 2 e 3");
            }
            else if (vetor[cont] % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + vetor[cont]+" é multiplo de 2");
            }
            else if (vetor[cont] % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + vetor[cont]+" é multiplo de 3");
            }
        }
    }
}
