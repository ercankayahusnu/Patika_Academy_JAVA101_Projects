package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class UcakBiletFiyatlandirmaProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mesafe;
        int yas;
        int yolculukTipi;
        double biletFiyat;
        double indirimliBiletFiyati;
        System.out.println("Uçmak istediğiiz mesafeyi giriniz (KM cinsinden)");
        mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi seçiniz 1-Gidiş / 2- Gigiş-Dönüş ");
        yolculukTipi = input.nextInt();

        if ((0 < mesafe) && (yolculukTipi == 1 || yolculukTipi == 2)) {

            if (yas < 12) {

                biletFiyat = mesafe * 0.10;
                System.out.println("Bilet Fiyatı :" + biletFiyat + "TL");
                indirimliBiletFiyati = biletFiyat - (biletFiyat * 50 / 100);
                System.out.println("%50 İndirim Uygulanmış bilet fiyatı " + indirimliBiletFiyati + "TL");

            } else if (12 <= yas && yas <= 24) {

                biletFiyat = mesafe * 0.10;
                System.out.println("Bilet Fiyatı :" + biletFiyat + "TL");
                indirimliBiletFiyati = biletFiyat - (biletFiyat * 10 / 100);
                System.out.println("%10 İndirim Uygulanmış bilet fiyatı " + indirimliBiletFiyati + "TL");

            } else if (yas >= 65) {

                biletFiyat = mesafe * 0.10;
                System.out.println("Bilet Fiyatı :" + biletFiyat + "TL");
                indirimliBiletFiyati = biletFiyat - (biletFiyat * 30 / 100);
                System.out.println("%30 İndirim Uygulanmış bilet fiyatı " + indirimliBiletFiyati + "TL");

            } else if (yas >= 25 && yas <= 65) {

                biletFiyat = mesafe * 0.10;
                System.out.println("Bilet Fiyatı :" + biletFiyat + "TL");

            } else if (yolculukTipi == 2) {

                biletFiyat = mesafe * 0.10;
                System.out.println("Bilet Fiyatı :" + biletFiyat + "TL");
                indirimliBiletFiyati = biletFiyat - (biletFiyat * 20 / 100);
                System.out.println("%20 İndirim Uygulanmış bilet fiyatı " + indirimliBiletFiyati + "TL");
            }

        } else {
            System.out.println("Hatalı Veri Girişi . Lütfen tekrar deneyiniz .");
        }
    }
    /*
         Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
         yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
         İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

     */
}


