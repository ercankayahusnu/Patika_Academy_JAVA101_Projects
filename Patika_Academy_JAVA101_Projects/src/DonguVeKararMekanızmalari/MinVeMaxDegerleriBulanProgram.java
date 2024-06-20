package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class MinVeMaxDegerleriBulanProgram {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
            return;
        }

        int sayi;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        int sayac = 0;

        while (sayac < n) {
            System.out.print((sayac + 1) + ". sayıyı girin: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            sayac++;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

    }
}
