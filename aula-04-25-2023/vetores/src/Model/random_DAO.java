
package Model;

import java.util.Random;
import javax.swing.JOptionPane;

public class random_DAO {
    public static void geraAle() {
        Random gerador = new Random();
        int[] vet = new int[3];
        String total = "";
        
        for(int c = 0; c < 3; c++) {
            vet[c] = gerador.nextInt(10);
            total += vet[c] + " | ";
        }
        JOptionPane.showMessageDialog(null, total);
    }
}
