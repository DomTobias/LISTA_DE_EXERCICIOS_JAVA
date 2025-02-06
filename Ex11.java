package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um Número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite outro Número: ");
        int n2 = sc.nextInt();

        int resto = n1 % n2;

        if (resto == 1) {
            int soma = n1 + n2 + resto;
            System.out.println("A soma das variáveis mais o resto da divisão é: " + soma);
        } else if (resto == 2) {
            if (n1 % 2 == 0) {
                System.out.printf("%d é par%n", n1);
            } else {
                System.out.printf("%d é ímpar%n", n1);
            }
            
            if (n2 % 2 == 0) {
                System.out.printf("%d é par%n", n2);
            } else {
                System.out.printf("%d é ímpar%n", n2);
            }
        } else if (resto == 3) {
            int mult = n1 * n2;
            System.out.printf("A multiplicação é: %d%n", mult);
        } else if (resto == 4) {
            if (n2 != 0) {
                double div = (double) (n1 + n2) / n2;
                System.out.printf("A divisão da soma dos números pelo segundo é: %.2f%n", div);
            } else {
                System.out.println("Erro: divisão por zero não permitida.");
            }
        } else {
            int quadradoN1 = n1 * n1;
            int quadradoN2 = n2 * n2;
            System.out.printf("O quadrado de %d é: %d%n", n1, quadradoN1);
            System.out.printf("O quadrado de %d é: %d%n", n2, quadradoN2);
        }

        sc.close();
    }
}
