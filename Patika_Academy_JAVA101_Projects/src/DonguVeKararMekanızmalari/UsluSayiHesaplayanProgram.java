package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int taban, ust, toplam = 1;
        boolean programKontrol = true;

        System.out.println("Programı kapatmak içi ust 00 ve taban 00 değerleri girilmelidir.");
        while (programKontrol == true) {

            System.out.print("Taban degeri giriniz :");
            taban = input.nextInt();
            System.out.print("Üst değeri giriniz :");
            ust = input.nextInt();

            if (ust > 0) {
                // Pozitif üs durumu
                for (int i = 1; i <= ust; i++) {
                    toplam *= taban;
                }
                System.out.println(taban + " Sayısının " + ust + ". Kuvveti = " + toplam);

            } else if (ust < 0) {
                // Negatif üs durumu
                for (int i = -1; i >= ust; i--) {
                    System.out.println(i);
                    toplam *= taban;
                }
                System.out.println(taban + " Sayısının " + ust + ". Kuvveti = 1/" + toplam);

            } else if (taban == 00 && ust == 00) {
                //programı kapatmak için üst ve tabana 00 00 girilmelidir
                programKontrol = false;

            } else {
                // Üs 0 ise
                if (taban != 0) {
                    System.out.println("0 girildiği için sonuç 1 olur");
                } else {
                    System.out.println("0 üzeri 0 belirsizdir.");
                }
            }

        }
    }
}

