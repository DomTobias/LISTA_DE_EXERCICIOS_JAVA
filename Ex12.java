package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um Número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Digite um Número: ");
        int n2 = sc.nextInt();
        
        System.out.print("Digite um Número: ");
        int n3 = sc.nextInt();
        
        int menor = Math.min(n1, Math.min(n2, n3));
        int maior = Math.max(n1, Math.max(n2, n3));
        int meio = n1 + n2 + n3 - menor - maior;  

        System.out.printf("Os números em ordem crescente são: %d, %d, %d%n", menor, meio, maior);

        sc.close();
    }
}
