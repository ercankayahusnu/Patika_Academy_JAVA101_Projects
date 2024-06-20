package KosulluIfadelerVeKodBloklari;

import java.util.Scanner;

public class KullaniciGirisiniKontrolEdenProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, resetPasswordChoice, newPassword;
        System.out.println("Username:");
        userName = input.nextLine();
        System.out.println("Enter your password:");
        password = input.nextLine();
        if (userName.equals("Admin") && password.equals("Password")) {

            System.out.println("Successful login with correct username and password.");
        } else {
            System.out.println("Incorrect username or password.");

            System.out.println("Do you want to reset your password? 1 - Yes / 2 - No ");
            resetPasswordChoice = input.nextLine();

            if (resetPasswordChoice.equals("1")) {

                System.out.println("Please enter your new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals("Password")) {

                    System.out.println("New password cannot be the same as the old one, password creation failed.");
                } else {
                    System.out.println("Password created successfully.");
                }

            } else if (resetPasswordChoice.equals("2")) {

                System.out.println("Password reset canceled.");
            }
        }
    }
    /*
         Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
         şifreler aynı ise ekrana "Şifre oluşturulamadı,
         lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */
}

