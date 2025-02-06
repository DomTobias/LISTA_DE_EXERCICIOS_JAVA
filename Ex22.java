package main;

public class Ex22 {
    public static void main(String[] args) {
    	double salario = 1000.0;
        double aumento = 1.5; 
        int anoInicial = 2003;
        int anoFinal = 2010;

        for (int ano = anoInicial; ano <= anoFinal; ano++) {
            salario += (salario * aumento) / 100; 
            System.out.printf("Salário em %d: R$ %.2f%n", ano, salario);
            aumento *= 2; 
        }
               
    }
}
