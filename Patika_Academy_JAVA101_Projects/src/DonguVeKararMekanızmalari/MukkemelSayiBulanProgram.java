package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class MukkemelSayiBulanProgram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int carpan = 1;

        // Pozitif tam sayı çarpanlarını bulma
        while (carpan <= sayi / 2) {
            if (sayi % carpan == 0) {
                toplam += carpan;
            }
            carpan++;
        }

        // Mükemmel sayı kontrolü
        if (toplam == sayi && sayi != 1) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}

