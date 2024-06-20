package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralamaProgrami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A, B, C;
        System.out.println("1. sayıyı giriniz:");
        A = input.nextInt();
        System.out.println("2. sayıyı giriniz:");
        B = input.nextInt();
        System.out.println("3. sayıyı giriniz:");
        C = input.nextInt();

        // Büyükten küçüğe sıralama
        if (A >= B && A >= C) {
            if (B >= C) {
                System.out.println("A > B > C");
            } else {
                System.out.println("A > C > B");
            }
        } else if (B >= A && B >= C) {
            if (A >= C) {
                System.out.println("B > A > C");
            } else {
                System.out.println("B > C > A");
            }
        } else { // C en büyük
            if (A >= B) {
                System.out.println("C > A > B");
            } else {
                System.out.println("C > B > A");
            }
        }
    }
}


