package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.print("Lütfen kilonuzu (kg cinsinden ) giriniz: ");
        kilo = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = scanner.nextDouble();

        indeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
    /*
            Vücut Kitle İndeksi Hesaplama:
            Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
            ekrana yazdırın.
            Formül
            Kilo (kg) / Boy(m) * Boy(m)
            Test Değerleri
            Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
            Lütfen kilonuzu giriniz : 105
            Vücut Kitle İndeksiniz : 35.49215792320173
     */
}

