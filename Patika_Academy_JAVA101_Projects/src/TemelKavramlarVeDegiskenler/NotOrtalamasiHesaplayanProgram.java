package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Matematik;
        int Fizik;
        int Kimya;
        int Turkce;
        int Tarih;
        int Muzik;
        int Ortalama;
        System.out.println("-------- NOT ORTALAMAASI PROGRAMINA HOŞGELDİNİZ --------");

        System.out.print("Matematik Notunuzu Giriniz:");
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        Fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        Kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        Turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        Tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        Muzik = input.nextInt();

        System.out.println("-------- ORTALAMANIZ HESAPLANIYOR  --------");

        Ortalama = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik) / 6;
        System.out.println("ORTALAMANIZ : " + Ortalama);

        System.out.println(Ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        /*
              Not Ortalaması Hesaplayan Program :
            Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp
            ekrana bastırılan programı yazın.

             Ödev
            Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti",
            küçük ise "Sınıfta Kaldı" yazsın.

            Not: Ternary Operator kullanarak yapılacak.
         */

    }
}


