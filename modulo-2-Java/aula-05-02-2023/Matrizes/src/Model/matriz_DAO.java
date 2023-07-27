package Model;

import javax.swing.JOptionPane;

public class matriz_DAO {

    public static void matriz() {
        String total = "";
        int val[][] = new int[2][2];

        for (int L = 0; L < 2; L++) {
            for (int c = 0; c < 2; c++) {
                String x = JOptionPane.showInputDialog(null, "Digite um número");
                val[L][c] = Integer.parseInt(x);
                total = total + val[L][c]+ " | ";
            }
            total = total + "\n";
            
        }
        JOptionPane.showMessageDialog(null, total);
    }
}
