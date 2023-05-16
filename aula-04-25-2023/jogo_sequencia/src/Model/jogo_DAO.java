package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class jogo_DAO {

    public static void sequencia() {
        int[] vetPc = new int[10];
        int[] vetPl = new int[10];
        int acertos = 0;

        Random gerador = new Random();

        acertos = 0;
        String sePc = "", sePl = "";
        for (int i = 0; i < 10; i++) {
            vetPc[i] = gerador.nextInt(3);
            sePc += vetPc[i] + " | ";
        }

        for (int i = 0; i < 10; i++) {
            int comp = 0, numX = 0;
            while (comp == 0) {
                String x = JOptionPane.showInputDialog(null, "Digite um número de 0 a 2:\nDigite o número " + (i + 1)  + ":");
                numX = Integer.parseInt(x);
                if (numX >= 0 && numX < 3) {
                    comp++;
                } else {
                    JOptionPane.showMessageDialog(null, "Número invalido digite de novo");
                }
            }
            vetPl[i] = numX;
            sePl += vetPl[i] + " | ";

            if (vetPc[i] == vetPl[i]) {
                acertos++;
            }
        }
            

            JOptionPane.showMessageDialog(null, "PC: " + sePc + "\nPL: " + sePl);
            JOptionPane.showMessageDialog(null, "Você acertou " + acertos + " números");
      
    }
}
