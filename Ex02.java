package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o Valor do Produto: ");
		double prod = sc.nextDouble();
		
		System.out.print("Digite o Valor do Frete: ");
		double frete = sc.nextDouble();
		
		double total = prod + frete;
		
		double desconto = total - (total * 10)/100;
		
		System.out.printf("O Valor Sera: " + desconto);
		
		sc.close();
	}

}
