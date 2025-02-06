package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor de J: ");
        int j = sc.nextInt();
        
        System.out.print("Digite o valor de K: ");
        int k = sc.nextInt();
        
        int troca=j;
        j=k;
        k=troca;
        
        System.out.printf("Valor de J é %d e de K e´ %d",j,troca);
        sc.close();
    }
}
