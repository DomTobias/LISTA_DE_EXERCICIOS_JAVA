package main;
import java.util.Scanner;

public class Ex23 {
    
    public static double calcularReajuste(double saldo, double percentual) {
        return saldo + (saldo * percentual / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o saldo da aplicação: ");
        double saldo = sc.nextDouble();
        
        System.out.print("Digite o percentual de reajuste: ");
        double percentual = sc.nextDouble();
        
        double novoSaldo = calcularReajuste(saldo, percentual);
        
        System.out.println("Novo saldo após o reajuste: " + novoSaldo);
        
        sc.close();
    }
}
