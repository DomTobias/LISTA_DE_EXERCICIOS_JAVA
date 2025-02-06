package main;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma Palavra: ");
        String n1 = sc.nextLine();
        
        System.out.print("Digite uma Palavra: ");
        String n2 = sc.nextLine();
        
        if(n1.equalsIgnoreCase(n2)) {
        	System.out.println("A Palavra é Igual");
        } else {
        	System.out.println("A Palavra é Diferente");
        }
        
        sc.close();
    }
}
