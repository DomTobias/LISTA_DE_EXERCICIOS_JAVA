package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o lado do triangulo: ");
        int l1 = sc.nextInt();
        
        System.out.print("Digite o lado do triangulo: ");
        int l2 = sc.nextInt();
        
        System.out.print("Digite o lado do triangulo: ");
        int l3 = sc.nextInt();
        
        if (l1 == l2 && l1 == l3) {
            System.out.println("Triângulo Equilátero");
            
        } else if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Triângulo Escaleno");
            
        } else {
            System.out.println("Triângulo Isósceles");
        }

        sc.close();
    }
}
