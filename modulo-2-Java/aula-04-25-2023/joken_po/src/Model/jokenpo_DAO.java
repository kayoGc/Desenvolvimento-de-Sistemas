package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class jokenpo_DAO {

    public static void jogo() {
        Random gerador = new Random();
        String[] opcao = {"pedra", "papel", "tesoura"};
        int pontosPc = 0, pontosPl = 0;
        while (pontosPc < 2 && pontosPl < 2) {
            String pc, pl, total = "";
            pc = opcao[gerador.nextInt(3)];
            pl = JOptionPane.showInputDialog("Digite a sua jogada:\nPedra, papel ou tesoura").toLowerCase();
            total += "Você = " + pl + "\nPC = " + pc;
            if (pc.equals(pl)) {
                total += "\nEmpate!";
            } else if (pc.equals(opcao[0]) && pl.equals(opcao[2])) {
                total += "\nVocê perdeu!";
                pontosPc++;
            } else if (pc.equals(opcao[1]) && pl.equals(opcao[0])) {
                total += "\nVocê perdeu!";
                pontosPc++;
            } else if (pc.equals(opcao[2]) && pl.equals(opcao[1])) {
                total += "\nVocê perdeu!";
                pontosPc++;
            } else {
                total += "\nVocê ganhou!";
                pontosPl++;
            }
            total += "\nPlacar:\nVocê: " + pontosPl + " PC: " + pontosPc;
            JOptionPane.showMessageDialog(null, total);
        }
        if (pontosPc > pontosPl) {
            JOptionPane.showMessageDialog(null, "O computador ganhou a melhor de 3!");
        } else if (pontosPl > pontosPc) {
            JOptionPane.showMessageDialog(null, "Você ganhou a melhor de 3!");
        }
    }
}
