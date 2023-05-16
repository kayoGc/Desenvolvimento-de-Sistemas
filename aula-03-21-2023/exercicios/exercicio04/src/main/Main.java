
package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int qtd = 0, cont=0;
        System.out.print("Quantos 'isso é um teste' vai ter :");
        qtd = grava.nextInt();
        
        while (cont < qtd) {
            cont++;
            System.out.println("Isso é um teste " + cont);
           
        }
    }
    
}
