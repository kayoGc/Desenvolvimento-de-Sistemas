package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int qtde;
        double soma = 0, media;
        System.out.print("Quer ver a media de quantos alunos? ");
        qtde = grava.nextInt();
        for (int i=1; i <= qtde; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            soma += grava.nextDouble();
        }
        media = soma / qtde;
        System.out.format("A média dos alunos é: %.2f", media);
    }
    
}
