
package main;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       double nota1, nota2, nota3;
       
       // nome aluno
       String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
       // notas
       String x = JOptionPane.showInputDialog("Digite a nota 1");
       nota1 = Double.parseDouble(x);
       x = JOptionPane.showInputDialog("Digite a nota 2");
       nota2 = Double.parseDouble(x);
       x = JOptionPane.showInputDialog("Digite a nota 3");
       nota3 = Double.parseDouble(x);
       
       double media = (nota1 + nota2 + nota3) / 3;
        
       JOptionPane.showMessageDialog(null, "O aluno " + nome + String.format(" recebeu a media %.2f", media));
    } 
    
}
