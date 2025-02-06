package main;
import java.util.Scanner;
import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um Numero: ");
            n[i] = sc.nextInt(); 
        }

        Arrays.sort(n);

        System.out.println("Numeros em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
        	System.out.print(n[i] + " "); 
        }
        
        System.out.println("\nNumeros em ordem decrescente: ");
        for (int i = 9; i >= 0; i--) {  
            System.out.print(n[i] + " "); 
        }
        
        

        sc.close();
    }
}
