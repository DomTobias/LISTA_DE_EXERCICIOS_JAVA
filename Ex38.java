package main;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a fruta que você deseja: ");
        String fruta = sc.nextLine();

        System.out.print("Digite quantos KG você irá querer: ");
        int kg = sc.nextInt();

        float preco = 0.0f;
        float desconto = 0.0f;

        if (fruta.equalsIgnoreCase("Mamão")) {
            if (kg >= 3) {
                preco = 7.50f * kg;
            } else {
                preco = 5.30f * kg;
            }
        } else if (fruta.equalsIgnoreCase("Banana")) {
            if (kg >= 3) {
                preco = 3.50f * kg;
            } else {
                preco = 2.80f * kg;
            }
        } else if (fruta.equalsIgnoreCase("Uva")) {
            if (kg >= 3) {
                preco = 13.50f * kg;
            } else {
                preco = 12.00f * kg;
            }
        } else {
            System.out.println("Não temos essa fruta");
            sc.close();
            return;
        }
        
        if (preco >= 15) {
            desconto = (preco * 10) / 100;
            preco -= desconto;
        }

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Preço final: R$ " + preco);

        sc.close();
    }
}
