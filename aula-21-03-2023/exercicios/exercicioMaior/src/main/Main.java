
package main;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int cont=1, maior=0, numero=0;
        System.out.println("Digite 3 números:");
        do {
            System.out.print("Número " + cont + ": ");
            numero = grava.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            cont++;
        } while (cont <= 3);
        
        System.out.println("O maior número é: " + maior);
    }
    
}
