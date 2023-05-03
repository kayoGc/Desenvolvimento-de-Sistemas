
package Model;
import java.util.Random;
import javax.swing.JOptionPane;

public class atv1_DAO {
    public static void atv1_DAO() {
        String total = "";
        int val [][] = new int [6][6];
        Random gerador = new Random();
        
        for(int L = 0; L < 6; L++) {
            for(int c = 0; c < 6; c++) {
                val[L][c] = gerador.nextInt(101);
                total += val[L][c] + " | ";
            } 
           total += "\n";
        }
        JOptionPane.showMessageDialog(null, total);
    }
    
}
