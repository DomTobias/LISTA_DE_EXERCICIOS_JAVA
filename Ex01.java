package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Escreva um Numero: ");
        int n1 = sc.nextInt();

        System.out.print("Escreva um Numero: ");
        int n2 = sc.nextInt();

        System.out.print("Escreva um Numero: ");
        int n3 = sc.nextInt();

        int maior = Math.max(n1, Math.max(n2, n3));
        int menor = Math.min(n1, Math.min(n2, n3));

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();
    }
}
