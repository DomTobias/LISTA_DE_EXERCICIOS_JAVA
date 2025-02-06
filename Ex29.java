package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a Altura da Mercadoria: ");
		float alt = sc.nextFloat();
		
		System.out.print("Digite o Comprimento da Mercadoria: ");
		float com = sc.nextFloat();
		
		System.out.print("Digite a Largura da Mercadoria: ");
		float lar = sc.nextFloat();
		
		System.out.print("Digite a Quantidade de Volume: ");
		float quant = sc.nextFloat();
		
		int fator = 300;	
		float preco = 0.20f;
		float volume = alt * com * lar * quant * fator;
		float valor = volume * preco;
		
		System.out.println("");
		System.out.printf("O Volume é de %.1f %n",volume);
		System.out.printf("Valor Cobrado R$ %.2f",valor);
		
		sc.close();
	}

}
