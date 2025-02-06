package main;

public class Ex17 {
    public static void main(String[] args) {
        System.out.println("Números primos até 250:");

        int num = 2;

        do {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 250);
    }
}
