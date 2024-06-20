package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class KdvTutariniHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KDV1 = 0.18;
        double KDV2 = 0.08;
        double KDVsizTutar;
        double KDVliTutar1;
        double KDVliTutar2;
        double KDVTutari;

        System.out.println("######### KDV HESAPLAMA PROGRAMI ########");

        System.out.println("Tutar giriniz : ");
        KDVsizTutar = input.nextDouble();

        System.out.println("KDV ' siz tutar : " + KDVsizTutar);

        if (0 < KDVsizTutar && KDVsizTutar <= 1000) {
            KDVliTutar1 = KDVsizTutar + (KDVsizTutar * KDV1);
            KDVTutari = KDVliTutar1 - KDVsizTutar;
            System.out.println("KDV 'li tutar " + KDVliTutar1);
            System.out.println("KDV  tutarı " + KDVTutari);

        } else if (KDVsizTutar > 1000) {
            KDVliTutar2 = KDVsizTutar + (KDVsizTutar * KDV2);
            KDVTutari = KDVliTutar2 - KDVsizTutar;
            System.out.println("KDV 'li tutar " + KDVliTutar2);
            System.out.println("KDV  tutarı " + KDVTutari);
        }
    }

    /*
        KDV Tutarı Hesaplayan Program :

        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

     */
}

