package KosulluIfadelerVeKodBloklari;
import java.util.Scanner;

public class BurcBulmaProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ay;
        int gun;
        System.out.println("Doğum ayınız nedir ?");
        ay = input.nextLine();
        System.out.println("Doğum gününüz nedir ?");
        gun = input.nextInt();
        if ((ay.equals("Mart") && gun <= 21) || (ay.equals("Nisan") && gun <= 20)) {

            System.out.println("KOÇ BURCU");

        } else if ((ay.equals("Nisan") && gun >= 21) || ((ay.equals("Mayıs") && gun <= 21))) {

            System.out.println("BOĞA BURCU");

        } else if ((ay.equals("Mayıs") && gun >= 22) || ((ay.equals("Haziran") && gun <= 22))) {

            System.out.println("İKİZLER BURCU");

        } else if ((ay.equals("Haziran") && gun >= 23) || ((ay.equals("Temmuz") && gun <= 22))) {

            System.out.println("YENGEÇ BURCU");

        } else if ((ay.equals("Temmuz") && gun >= 23) || ((ay.equals("Ağustos") && gun <= 22))) {

            System.out.println("ASLAN BURCU");

        } else if ((ay.equals("Ağustos") && gun >= 23) || ((ay.equals("Eylül") && gun <= 22))) {

            System.out.println("BAŞAK BURCU");

        } else if ((ay.equals("Eylül") && gun >= 23) || ((ay.equals("Ekim") && gun <= 22))) {

            System.out.println("TERAZİ BURCU");

        } else if ((ay.equals("Ekim") && gun >= 23) || ((ay.equals("Kasım") && gun <= 21))) {

            System.out.println("AKREP BURCU");

        } else if ((ay.equals("Kasım") && gun >= 22) || ((ay.equals("Aralık") && gun <= 21))) {

            System.out.println("YAY BURCU");

        } else if ((ay.equals("Aralık") && gun >= 22) || ((ay.equals("Ocak") && gun <= 21))) {

            System.out.println("OĞLAK BURCU");

        } else if ((ay.equals("Ocak") && gun >= 22) || ((ay.equals("Şubat") && gun <= 19))) {

            System.out.println("KOVA BURCU");

        } else if ((ay.equals("Şubat") && gun >= 20) || ((ay.equals("Mart") && gun <= 20))) {

            System.out.println("BALIK BURCU");
        }
    }

    /*
            Koç Burcu : 21 Mart - 20 Nisan

            Boğa Burcu : 21 Nisan - 21 Mayıs

            İkizler Burcu : 22 Mayıs - 22 Haziran

            Yengeç Burcu : 23 Haziran - 22 Temmuz

            Aslan Burcu : 23 Temmuz - 22 Ağustos

            Başak Burcu : 23 Ağustos - 22 Eylül

            Terazi Burcu : 23 Eylül - 22 Ekim

            Akrep Burcu : 23 Ekim - 21 Kasım

            Yay Burcu : 22 Kasım - 21 Aralık

            Oğlak Burcu : 22 Aralık - 21 Ocak

            Kova Burcu : 22 Ocak - 19 Şubat

            Balık Burcu : 20 Şubat - 20 Mart
     */
}
