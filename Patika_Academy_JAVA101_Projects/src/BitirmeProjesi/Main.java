package BitirmeProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = 0;
        int cols = 0;

        while (rows < 2 || cols < 2) {
            System.out.print("Satır sayısını girin (min 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını girin (min 2): ");
            cols = scanner.nextInt();

            if (rows < 2 || cols < 2) {
                System.out.println("Matris boyutu en az 2x2 olmalıdır. Tekrar deneyin.");
            }
        }

        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}


