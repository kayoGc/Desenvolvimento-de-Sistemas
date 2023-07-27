package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int idade = 0;
        double media = 0; 
        int cont = 0;
        int qtdAlunos = 0;
        
        System.out.println("Quantos alunos? ");
        qtdAlunos = grava.nextInt();
        while (cont < qtdAlunos) {
            cont++;
            System.out.print("Idade do aluno " + cont + ": " );
            media = media + grava.nextInt();
           
        }  
        media = media / cont;
        System.out.println("A media é: " + media);
        
    }
    
}
