
package main;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int numA=0, numB=0, numC=0, troca=0;
        System.out.print("Digite o valor de A: ");
        numA = grava.nextInt();
        System.out.print("Digite o valor de B: ");
        numB = grava.nextInt();
        System.out.print("Digite o valor de C: ");
        numC = grava.nextInt();
        int cont = 0;
        
        while (cont < 5) {
            if (numA > numB) {
                troca = numA;
                numA = numB;
                numB = troca;
            } else if (numB > numC){
                troca = numB;
                numC = troca;
            }
            cont++;
        }
        System.out.println("" + numA + " " + numB + " " + numC);
    }
}
