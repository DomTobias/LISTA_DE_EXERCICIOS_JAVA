package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos KMs você percorrerá: ");
        double km = sc.nextDouble();

        System.out.print("Quantos KMs seu carro faz por litro: ");
        double consumo = sc.nextDouble();

        System.out.print("Qual o preço do combustível (R$): ");
        double preco = sc.nextDouble();

        double litros = km / consumo;
        double custoTotal = litros * preco;

        System.out.printf("O gasto total com combustível será de R$ %.2f%n", custoTotal);

        sc.close();
    }
}
