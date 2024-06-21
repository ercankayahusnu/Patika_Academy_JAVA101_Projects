package Metotlar;

import java.util.Scanner;

public class RecursiveMetotlarileAsalSayiHesaplama {

    public static boolean asalMi(int sayi, int bolen) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi) {
            return true;
        }
        return asalMi(sayi, bolen + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }
}
