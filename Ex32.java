package main;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];  

        funcao(vetor, sc);
        
        sc.close();  
    }

    static void funcao(int[] vetor, Scanner sc) {
        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um Numero: ");
            vetor[i] = sc.nextInt();  
        }

        int maior = vetor[0];
        for (int i = 1; i < 5; i++) {
            maior = Math.max(maior, vetor[i]);
        }

        System.out.println("O maior número digitado é: " + maior);
    }
}
