package main;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant, i;
        float nota, media, somaNotas;
      
        do {
            System.out.print("Digite quantos alunos há na sala: ");
            quant = sc.nextInt();
            
            if (quant >= 30) {
                System.out.printf("O número de alunos deve ser menor que 30.\n");
            }
            
            somaNotas = 0;
            
            for (i = 1; i <= quant; i++) {
                System.out.printf("Digite a Nota do Aluno %d: ", i);
                nota = sc.nextFloat();
                somaNotas += nota;
            }
            
            media = somaNotas / quant;
            System.out.printf("A média da sala é: %.2f\n", media);
            
        } while (quant >= 30);
        
        sc.close();  
    }
}
