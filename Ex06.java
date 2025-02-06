package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um Numero: ");
		double n = sc.nextDouble();
		
		if(n % 2 == 0) {
			System.out.println("Valor Armazenado em P");
		} else {
			System.out.println("Valor Armazenado em I");
		}
		
		sc.close();
	}

}
