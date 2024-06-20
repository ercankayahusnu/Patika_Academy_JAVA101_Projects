package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class ElmasCizenProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Elmas yüksekliği tek sayı olmalıdır.Lütfen tek sayı giriniz :");
        n = input.nextInt();

        // Üst kısmı çizdirme
        for (int i = 1; i <= n; i += 2) {
            // Boşlukları çizdirme
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları çizdirme
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı çizdirme
        for (int i = n - 2; i >= 1; i -= 2) {
            // Boşlukları çizdirme
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları çizdirme
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
