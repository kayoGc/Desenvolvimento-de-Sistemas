package exercicio4.pkg28.pkg03.pkg2023;

import java.util.Scanner;

public class Exercicio428032023 {

    
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
      int msg;
      int cont;
      System.out.println("Digite quantas quer que a mensagem seja exibida");
      cont = grava.nextInt();
      for(msg = 1; msg <= cont; msg++){
         System.out.println("Isso é um teste");
       }
    }
    
}
