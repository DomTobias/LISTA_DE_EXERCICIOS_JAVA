package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o Codigo do Cargo: ");
		int cargo = sc.nextInt();
		
		System.out.print("Digite o Valor do Salário R$ ");
		double salario = sc.nextDouble();
		
		double aumento;
		if (cargo == 101) {
			aumento = salario + (salario * 5) /100;
		} else if (cargo == 102) {
			aumento = salario + (salario * 7.5) /100;
		} else if (cargo == 103) {
			aumento = salario + (salario * 10) /100;
		} else {
			aumento = salario + (salario * 15) /100;
		}
		
		System.out.printf("Valor do Novo Salário de R$ %.2f",aumento);
		
		sc.close();
	}

}
