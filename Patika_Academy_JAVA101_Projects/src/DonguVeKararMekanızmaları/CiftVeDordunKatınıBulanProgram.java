package DonguVeKararMekanızmaları;

import java.util.Scanner;

public class CiftVeDordunKatınıBulanProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi;

        System.out.println("Programdan çıkmak için tek bir sayı giriniz.");

        while (true) {
            System.out.print("Lütfen bir sayı giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi % 2 == 0 || girilenSayi % 4 == 0) {
                toplam += girilenSayi;
            }

            if (girilenSayi % 2 != 0) {
                break;
            }
        }
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
        scanner.close();
    }
    /*      Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
            ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
}

