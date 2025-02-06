package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite uma Palavra: ");
        String palavra = sc.nextLine();
        
        int valorTotal = 0;
        
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                valorTotal += 5; 
            } else if ((letra >= 'a' && letra <= 'z')) {
                valorTotal += 10; 
            }
        }
        
        System.out.println("O valor total da palavra digitada é: " + valorTotal);
        
        sc.close();
    }
}
