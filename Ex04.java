package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
                
        System.out.print("Digite seu Sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        
        System.out.print("Digite sua Altura: ");
        double h = sc.nextDouble();
        
        double peso; 
        
        if (sexo == 'M' || sexo == 'm') { 
            peso = (72.7 * h) - 58; 
        } 
        else if (sexo == 'F' || sexo == 'f') { 
            peso = (62.1 * h) - 44.7;
        } 
        else {
            System.out.println("Sexo inválido! Digite M ou F.");
            sc.close();
            return; 
        }

        System.out.printf("Seu peso ideal é: %.2f kg%n", peso);

        sc.close();
    }
}
