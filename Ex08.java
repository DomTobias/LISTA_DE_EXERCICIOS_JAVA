package main;
import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite uma quantidade de segundos: ");
        int segundosTotais = sc.nextInt();

        int horas = segundosTotais / 3600;
        int minutos = (segundosTotais % 3600) / 60;
        int segundos = segundosTotais % 60;

        System.out.printf("%d segundos equivalem a %d horas, %d minutos e %d segundos.%n", segundosTotais, horas, minutos, segundos);

        sc.close();
    }
}
