package TemelKavramlarVeDegiskenler;

import java.util.Scanner;

public class DaireAlanVeCevresiniHesaplayanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int yariCap, aci;
        double alan, cevre;

        System.out.println("Yarıçapı Giriniz : ");
        yariCap = input.nextInt();

        System.out.println("Merkez Açısının Ölçüsünü Giriniz (derece cinsinden) : ");
        aci = input.nextInt();

        cevre = 2 * pi * yariCap;
        System.out.println("Dairenin Çevresi : " + cevre);


        alan = (pi * yariCap * yariCap * aci) / 360.0;
        System.out.println("Daire Diliminin Alanı : " + alan);

    }
    /*
            Dairenin Alanını ve Çevresini Hesaplayan Program

            Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

            Alan Formülü : π * r * r;

            Çevre Formülü : 2 * π * r;

            Ödev
            Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

            𝜋 sayısını = 3.14 alınız.

            Formül : (𝜋 * (r*r) * 𝛼) / 360

     */
}


