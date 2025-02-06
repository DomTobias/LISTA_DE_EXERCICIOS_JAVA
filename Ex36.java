package main;
import java.util.Scanner;

public class Ex36 {
    
    public static void mostrarTabuada(int num) {
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();
        
        mostrarTabuada(numero);
        
        sc.close();
    }
}
