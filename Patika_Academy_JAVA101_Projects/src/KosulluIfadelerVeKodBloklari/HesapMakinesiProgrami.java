package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class HesapMakinesiProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1;
        double sayi2;
        int secim;
        System.out.println("Birinci sayıyı giriniz :");
        sayi1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz :");
        sayi2 = input.nextDouble();
        System.out.println("Yapmak istediğniz işlemi seçiniz : ");
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        secim = input.nextInt();

        if (1 <= secim && secim <= 4) {
            switch (secim) {

                case 1:
                    System.out.println("Toplama İşlem Sonucu = " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma İşlemi Sonucu = " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma İşlemi Sonucu = " + (sayi1 * sayi2));
                    break;
                case 4:
                    System.out.println("Bölme İşlemi Sonucu = " + (sayi1 / sayi2));
                    break;
            }

        } else {
            System.out.println("Lütfen geçerli bir işlem giriniz !!! ");
        }
    }


}
