package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SinifGecmeDurumunuKontrolEdenProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik;
        int gecmeNotu = 55;
        int gecerliNotSayisi = 0;
        int toplamNot = 0;

        System.out.println("Matematik notunu giriniz (0-100 arası): ");
        matematik = input.nextInt();

        System.out.println("Fizik notunu giriniz (0-100 arası): ");
        fizik = input.nextInt();

        System.out.println("Türkçe notunu giriniz (0-100 arası): ");
        turkce = input.nextInt();

        System.out.println("Kimya notunu giriniz (0-100 arası): ");
        kimya = input.nextInt();

        System.out.println("Müzik notunu giriniz (0-100 arası): ");
        muzik = input.nextInt();

        if (matematik >= 0 && matematik <= 100) {
            toplamNot += matematik;
            gecerliNotSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            gecerliNotSayisi++;
        }
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            gecerliNotSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            gecerliNotSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            gecerliNotSayisi++;
        }
        if (gecerliNotSayisi > 0) {
            double ortalama = (double) toplamNot / gecerliNotSayisi;

            System.out.println("Ortalama: " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Dersi geçtiniz.");
            } else {
                System.out.println("Dersi geçemediniz.");
            }
        } else {
            System.out.println("Geçerli not girilmediği için ortalama hesaplanamadı.");
        }

    }
    /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

        Geçme Notu : 55

        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

     */

}

