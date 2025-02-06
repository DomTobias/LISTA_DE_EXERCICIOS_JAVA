package main;

public class Ex31 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9 || j == 0 || j == 9) {
                    System.out.printf(" 0 ");
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.printf("\n");
        }
    }
}
