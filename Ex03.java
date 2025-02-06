package main;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Raio da Circunferência: ");
        double raio = sc.nextDouble();  

        double area = 3.14 * (raio * raio); 
        double perimetro = 2 * 3.14 * raio;

        System.out.printf("A área da circunferência é: %.2f%n", area);
        System.out.printf("O perímetro da circunferência é: %.2f%n", perimetro);

        sc.close();
    }
}
