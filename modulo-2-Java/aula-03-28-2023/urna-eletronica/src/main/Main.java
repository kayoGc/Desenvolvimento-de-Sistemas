package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int digito=1, voto=0, cont = 0, cont2=0; 
        int bob=0, water=0, lula=0, nulo=0; // candidatos;
        String senha = "";
        
        while (digito != 4 && digito != 2) {
            System.out.println("1-Iniciar votação\n2-Finalizar votação\n3-Zerar urna\n4-Sair");
            System.out.print("Digito selecionado: ");
            digito = grava.nextInt();
            
            System.out.println();
            
            switch (digito) {
                case 1: // Abrir votação;
                    while (cont2 == 0) {
                        System.out.println("Candidatos:\n16-Bob Sponja\n24-Walter White\n32-Lula\n1-nulo\n2-Parar votação");
                        System.out.print("Seu voto vai para: ");
                        voto = grava.nextInt();
                        switch (voto) {
                            case 16:
                                bob++;
                                break;
                            case 24:
                                water++;
                                break;
                            case 32:
                                lula++;
                                break;
                            case 1:
                                nulo++;
                                break;
                            case 2:
                                System.out.println("Parando votação.");
                                cont2 = 1;
                                break;
                            default:
                                System.out.println("ERRO: Candidato não existe.");
                                break;
                        }
                    System.out.println();
                    }
                    break;
                case 2: // Finalizar Votação;
                    do {
                        System.out.print("Digite a senha:");
                        senha = grava.next();
                        cont++;
                    } while(!"1234".equals(senha) && cont < 3);
                    if ("1234".equals(senha)) {
                        System.out.println("Acesso Concedido.");
                        System.out.println("Fechando urna...");
                        System.out.println("Resultados finais:");
                        System.out.println("Votos para bob esponja: " + bob);
                        System.out.println("Votos para Water White: " + water);
                        System.out.println("Votos para Lula: " + lula);
                        System.out.println("Votos nulos: " + nulo);
                        System.out.println("Urna fechada!");
                    } else {
                        System.out.println("Acesso negado, voltando ao menu.");
                    }
                    break;
                case 3: // Zerar votações;
                    water = 0;
                    bob = 0;
                    lula = 0;
                    nulo = 0;
                    System.out.println("Votos zerados!");
                    System.out.println("Votos para bob esponja: " + bob);
                    System.out.println("Votos para Water White: " + water);
                    System.out.println("Votos para Lula: " + lula);
                    System.out.println("Votos nulos: " + nulo);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Saindo da urna sem finalizar votação.");
                    break;
                default:
                    System.out.println("Digito invalido.");
            }       
        }
    }
}
