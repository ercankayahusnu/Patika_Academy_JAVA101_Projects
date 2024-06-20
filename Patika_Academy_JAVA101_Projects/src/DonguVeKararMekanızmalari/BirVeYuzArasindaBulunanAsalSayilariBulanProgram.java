package DonguVeKararMekanızmalari;

public class BirVeYuzArasindaBulunanAsalSayilariBulanProgram {

    public static void main(String[] args) {

        System.out.println("1 ile 100 arasındaki asal sayılar:");


        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true; // Başlangıçta sayının asal olduğunu varsayalım

            // 2'den başlayarak sayının kendisine kadar olan sayılarla bölünüp bölünmediğini kontrol ediyoruz
            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false; // Eğer bölen bulursak sayı asal değil demektir
                    break; // Döngüyü sonlandırabiliriz
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}


