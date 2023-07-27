package main;

public class Main {
    
    public static void main(String[] args) {
        int soma=0, cont=1;
        
        while (cont <= 1000) {
            soma += cont;
            cont++;
        }
        System.out.println(soma);
    }
    
}
