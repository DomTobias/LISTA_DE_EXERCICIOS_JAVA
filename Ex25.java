package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite o Valor em Real: R$ ");
        double real = sc.nextDouble();
        
        System.out.print("Digite o Valor do Euro: E ");
        double euro = sc.nextDouble();
        
        System.out.print("Digite o Valor do Dolar: US ");
        double dolar = sc.nextDouble();
        
        double conv_euro = real / euro;
        double conv_dolar = real / dolar;
        
        System.out.printf("O Valor R$ %.2f convertido para euro é E %.2f\n", real, conv_euro);
        System.out.printf("O Valor R$ %.2f convertido para dolar é US %.2f\n", real, conv_dolar);
        
        sc.close();
    }
}
