package DonguVeKararMekanizmalari;

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        FaktoriyelHesaplayici hesaplayici = new FaktoriyelHesaplayici();

        try {

            long faktoriyel = hesaplayici.faktoriyelHesapla(sayi);
            System.out.println(sayi + "! = " + faktoriyel);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FaktoriyelHesaplayici {

    public long faktoriyelHesapla(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatif sayıların faktöriyeli hesaplanamaz.");
        }

        long faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        return faktoriyel;
    }
}
