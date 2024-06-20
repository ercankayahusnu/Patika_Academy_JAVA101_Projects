package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class EbobVeEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        // EBOB bulma
        int ebob = 1;
        int k = 2;

        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob = k;
            }
            k++;
        }

        // EKOK bulma
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);

    }
}
