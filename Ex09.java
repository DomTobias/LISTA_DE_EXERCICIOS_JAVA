package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a temperatura em graus Celsius: ");
        float celsius = sc.nextFloat();

        float kelvin = celsius + 273;
        float fahrenheit = 1.8f * celsius + 32;

        System.out.printf("A temperatura convertida para Kelvin: %.2f K%n", kelvin);
        System.out.printf("A temperatura convertida para Fahrenheit: %.2f °F%n", fahrenheit);

        sc.close();
    }
}
