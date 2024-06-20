package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class TersUcgenOlusturanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamak = scanner.nextInt();

        for (int i = basamak; i >= 1; i--) {

            for (int j = 1; j <= basamak - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
