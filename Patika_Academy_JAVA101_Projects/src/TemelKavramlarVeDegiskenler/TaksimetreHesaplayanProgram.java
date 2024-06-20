package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class TaksimetreHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Mesafe;
        double Ucret;

        System.out.println("Mesafeyi giriniz (KM) : ");
        Mesafe = input.nextDouble();
        Ucret = (Mesafe * 2.20) + 10;
        if (Ucret <= 20) {
            Ucret = 20;
            System.out.println(Ucret + " TL' dir.");
        }

        System.out.println(Ucret + " TL' dir.");
    }
    /*
            Taksimetre Programı

            Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir
     */
}
