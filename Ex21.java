package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String[] nomes = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o Nome %d: ", i + 1);
            nomes[i] = sc.next();
        }
        
        System.out.println("\nNomes digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
