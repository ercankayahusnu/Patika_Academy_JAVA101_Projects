package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class UcgendeAlanHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double Kenar1, Kenar2, Kenar3;
        double Cevre;
        double Alan;
        double YariCevre;
        System.out.println("1.Kenar uzunluğunu giriniz : ");
        Kenar1 = input.nextDouble();
        System.out.println("2.Kenar uzunluğunu giriniz : ");
        Kenar2 = input.nextDouble();
        System.out.println("3.Kenar uzunluğunu giriniz : ");
        Kenar3 = input.nextDouble();
        YariCevre = (Kenar1 + Kenar2 + Kenar3) / 2;
        Cevre = YariCevre * 2;
        Alan = Math.sqrt(YariCevre * (YariCevre - Kenar1) * (YariCevre - Kenar2) * (YariCevre - Kenar3));
        System.out.println("ÜÇGENİN ÇEVRESİ : " + Cevre);
        System.out.println("ÜÇGENİN ALANI : " + Alan);

    }
    /*
            Dik Üçgende Hipotenüs Bulan Program
            Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
            Ödev
            Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
            Formül
            Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
            𝑢 = (a+b+c) / 2
            Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */
}

