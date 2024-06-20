package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class FibonacciSerisiHesaplayanProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin kaç elemanını görmek istiyorsunuz? ");
        int n = scanner.nextInt();

        int a = 0; // İlk Fibonacci terimi
        int b = 1; // İkinci Fibonacci terimi

        System.out.println("Fibonacci serisinin ilk " + n + " elemanı:");

        // İlk n Fibonacci terimini bulma ve ekrana yazdırma
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b; // Sonraki Fibonacci terimi hesaplama
            a = b;
            b = next;
        }
    }
}
