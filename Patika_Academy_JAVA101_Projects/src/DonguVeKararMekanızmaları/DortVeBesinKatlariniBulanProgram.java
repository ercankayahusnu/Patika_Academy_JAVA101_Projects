package DonguVeKararMekanızmaları;

import java.util.Scanner;

public class DortVeBesinKatlariniBulanProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sayi;
        System.out.println("Sınır sayısınız giriniz :");
        sayi = sc.nextInt();
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println("Dört'ün katları :" + i);
        }
        System.out.println("------------------------------------------------------------------------");

        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println("Beş'in katları :" + i);
        }
    }
    /*
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */
}

