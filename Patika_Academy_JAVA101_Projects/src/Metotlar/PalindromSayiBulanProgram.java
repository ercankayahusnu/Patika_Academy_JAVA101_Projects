package Metotlar;

import java.util.Scanner;

public class PalindromSayiBulanProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Sayı giriniz:");
        number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " palindrom bir sayıdır.");
        } else {
            System.out.println(number + " palindrom bir sayı değildir.");
        }
    }

    // Metot: Bir sayının palindrom olup olmadığını kontrol eder
    static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Sayının rakamlarını tersine çevirerek reversedNumber değişkenine atıyoruz
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        // Tersine çevrilmiş sayı ile orijinal sayıyı karşılaştırıyoruz
        return originalNumber == reversedNumber;
    }
}
