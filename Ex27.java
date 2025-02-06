package main;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time1 = 0, time2 = 0;
        String op;
        
        do {
            do {
                System.out.print("Digite o Nome do Jogador: ");
                String nome = sc.nextLine();
                
                System.out.print("Em Qual Time Você Irá Cadastrar: [1/2]: ");
                int time = sc.nextInt();
                sc.nextLine(); 
                
                if (time == 1) {
                    time1++;
                    System.out.println("Você Escolheu Time 1");
                } else if (time == 2) {
                    time2++;
                    System.out.println("Você Escolheu Time 2");
                } else {
                    System.out.println("Opção Inválida");
                }
                
                System.out.print("Deseja Adicionar mais Jogador? [s/n]: ");
                op = sc.nextLine();
                
            } while (op.equalsIgnoreCase("s"));
        } while (time1 != time2);
        
        System.out.println("Os times estão equilibrados com " + time1 + " jogadores cada.");
        
        sc.close();
    }
}
