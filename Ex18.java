package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);  

        System.out.print("Digite o Nome do Aluno: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite a Nota 1: ");
        float n1 = sc.nextFloat();
        
        System.out.print("Digite a Nota 2: ");
        float n2 = sc.nextFloat();
        
        System.out.print("Digite a Nota 3: ");
        float n3 = sc.nextFloat();
        
        System.out.print("Digite a Nota 4: ");
        float n4 = sc.nextFloat();
        
        float media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("Média: %.2f %n", media);

        if (media <= 5) {
            System.out.printf("A Média do Aluno %s é Categoria D%n", nome);
        } else if (media > 5 && media <= 7) {
            System.out.printf("A Média do Aluno %s é Categoria C%n", nome);
        } else if (media > 7 && media <= 9) {
            System.out.printf("A Média do Aluno %s é Categoria B%n", nome);
        } else {
            System.out.printf("A Média do Aluno %s é Categoria A%n", nome);
        }
        
        sc.close();
    }
}
