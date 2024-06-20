package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlican = 5.00;
        double KgArmut, KgElma, KgDomates, KgMuz, KgPatlican;
        double ToplamTutar;
        System.out.println("Kaç KG Armut almak istersiniz ?");
        KgArmut = input.nextDouble();
        System.out.println("Kaç KG Elma almak istersiniz ? ");
        KgElma = input.nextDouble();
        System.out.println("Kaç KG Domates almak istersiniz ? ");
        KgDomates = input.nextDouble();
        System.out.println("Kaç KG Muz almak istersiniz ? ");
        KgMuz = input.nextDouble();
        System.out.println("Kaç KG Patlican almak istersiniz ? ");
        KgPatlican = input.nextDouble();
        ToplamTutar = (KgArmut * Armut) + (KgElma * Elma) + (KgDomates * Domates) + (KgMuz * Muz) + (KgPatlican * Patlican);
        System.out.println("Toplam Tutar : " + ToplamTutar + "TL");
    }

    /*
        Manav Kasa Programı:
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL

        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL

     */
}

