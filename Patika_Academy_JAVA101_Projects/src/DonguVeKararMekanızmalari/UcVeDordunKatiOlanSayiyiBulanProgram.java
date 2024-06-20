package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class UcVeDordunKatiOlanSayiyiBulanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int ortalama;
        int sayac = 0;
        int toplam = 0;

        System.out.println("Açıklama : Bu program 0 dan başlayarak girdiğiniz sayıya kadar olan bütün" +
                " sayıları tarayarak , 3 ve 4' e tam bölünen sayıların ortalamasını sizin için hesaplayacaktır.");
        System.out.println("Lütfen sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {

                toplam = toplam + i;
                sayac++;
            }
        }
        if (sayac > 0) {
            ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("Girdiğiniz aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
    }
    /*
         0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program.
     */
}
