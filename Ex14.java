package main;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int fiat = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a Marca do Carro %d: ", (i+1));
            String marca = sc.nextLine();

            if (marca.equalsIgnoreCase("Fiat")) { 
                fiat++;
            }
        }

        System.out.printf("Total de Carros da Marca Fiat: %d%n", fiat); 
        sc.close();
    }
}
