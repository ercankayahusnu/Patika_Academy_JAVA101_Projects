package DonguVeKararMekanızmalari;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sifre = 6048;
        int bakiye = 2500;
        int kullanicininGirdigiTutar;
        int kalanPara;
        int secilenIslem;
        int girisHakki = 3;

        System.out.println("----------------------- PARABENDE BANKASINA HOŞGELDİNİZ -------------------------------- ");

        System.out.println("Lütfen kartınızı ekranda gösterildiği gibi hazneye yerleştiriniz ... ");

        while (girisHakki > 0) {

            System.out.print("Lütfen Kart Şifrenizi Giriniz : ");
            sifre = input.nextInt();

            if (sifre == 6048) {

                System.out.println("Şifre Doğru.Giriş Başarılı");
                System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : \n 1-Para Çekme \n 2-Para Yatırmak \n 3-Bakiye Sorgulama \n 4-Çıkış");
                secilenIslem = input.nextInt();

                switch (secilenIslem) {
                    case 1:

                        System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");
                        kullanicininGirdigiTutar = input.nextInt();

                        if (kullanicininGirdigiTutar > bakiye) {

                            System.out.println("Bakiyeniz Yetersiz");

                        } else {
                            kalanPara = bakiye - kullanicininGirdigiTutar;
                            System.out.println("Hesabınızda Kalan Para: " + kalanPara);
                        }

                        break;

                    case 2:
                        System.out.println("Yatırmak İstediğiniz Parayı Hazneye Yerteştiriniz:");
                        kullanicininGirdigiTutar = input.nextInt();

                        if (kullanicininGirdigiTutar <= 0) {
                            System.out.println("Lütfen Geçerli Bir Sayı Giriniz:");
                        } else {
                            bakiye = bakiye + kullanicininGirdigiTutar;
                            System.out.println("Güncel Bakiyeniz " + bakiye);
                        }

                        break;

                    case 3:
                        System.out.println("Hesabınızda " + bakiye + "TL vardır.");
                        break;

                    case 4:
                        System.out.println("Çıkış Yaptınız");
                        break;
                }
                break;

            } else {

                girisHakki--;
                System.out.println("Hatalı Şifre Girdiniz .Lütfen tekrar deneyiniz : ");
            }
            if (girisHakki == 0) {

                System.out.println("Kartınız Bloke Olmuştur Lütfen Bankamızla İletişime Geçiniz");
            } else {
                System.out.println("Kalan Hakkınız : " + girisHakki);
            }
        }
    }
}
