package main;

public class Ex16 {
    public static void main(String[] args) {
        int contador = 1;
        do {
            if (contador % 2 == 0) {
            	System.out.printf("%n");
            	System.out.printf(" %d ",contador);
            }
            contador++;
        } while (contador <= 150);    
    }
}
