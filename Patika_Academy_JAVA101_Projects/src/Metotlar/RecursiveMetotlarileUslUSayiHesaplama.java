package Metotlar;

import java.util.Scanner;

public class RecursiveMetotlarileUslUSayiHesaplama {

    public static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();


        int sonuc = usHesapla(taban, us);


        System.out.println("Sonuç: " + sonuc);
    }
}

