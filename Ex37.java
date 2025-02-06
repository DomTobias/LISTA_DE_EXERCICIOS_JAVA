package main;
import java.util.Scanner;

public class Ex37 {
    public static void volume(float raio) {
    	float volume = (4/3) * 3.14f * (raio * raio * raio);
    	System.out.printf("O Volume é %.2f",volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        float raio = sc.nextFloat();
        
        volume(raio);
        
        sc.close();
    }
}
