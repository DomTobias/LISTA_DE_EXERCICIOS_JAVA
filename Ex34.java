package main;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o Número da Matriz na Posição [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %d ", matriz[i][j]);
            }
            System.out.println("");  
        }
        
        int dp = 0;  
        for (int i = 0; i < 3; i++) {
            dp += matriz[i][i];  
        }
        
        System.out.printf("A Soma da Diagonal Principal da Matriz é igual: %d\n", dp);
        
        sc.close();
    }
}
