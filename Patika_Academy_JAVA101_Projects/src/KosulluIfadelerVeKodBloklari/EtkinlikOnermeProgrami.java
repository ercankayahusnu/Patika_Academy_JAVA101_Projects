package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class EtkinlikOnermeProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık Değerini Girin :");
        sicaklik = input.nextInt();
        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirniz.Hava sıcaklığı bu etkinlik için uygun");

        } else if (5 <= sicaklik && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.Hava sıcaklığı bu etkinlik için uygun");

        } else if (15 <= sicaklik && sicaklik < 25) {
            System.out.println("Piknik yapabilirsiniz.Hava sıcaklığı bu etkinlik için uygun");

        } else if (25 <= sicaklik) {
            System.out.println("Yüzmeye gidebilirsiniz.Hava sıcaklığı bu etkinlik için uygun");
        }
    }
    /*
        Koşullar:
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

}

