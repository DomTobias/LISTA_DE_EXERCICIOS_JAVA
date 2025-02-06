package main;
import java.util.Locale;

public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int mediaT = (39 + 45 + 41 + 42 + 38) / 5;
        int mediaU = (10 + 14 + 12 + 9 + 7) / 5;

        System.out.printf("A média da temperatura foi: %d° %n", mediaT);
        System.out.printf("A média da umidade foi: %d%n", mediaU);
    }
}
