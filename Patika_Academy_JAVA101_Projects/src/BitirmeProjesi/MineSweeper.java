package BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] board;
    private String[][] mines;
    private int rows;
    private int cols;
    private int mineCount;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.board = new String[rows][cols];
        this.mines = new String[rows][cols];
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = "-";
                mines[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);

            if (!mines[row][col].equals("*")) {
                mines[row][col] = "*";
                placedMines++;
            }
        }
    }

    public void printBoard(String[][] board) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private boolean isMine(int row, int col) {
        return mines[row][col].equals("*");
    }

    private int countAdjacentMines(int row, int col) {
        int mineCount = 0;
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (isValidCoordinate(newRow, newCol) && isMine(newRow, newCol)) {
                mineCount++;
            }
        }

        return mineCount;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        boolean gameOver = false;
        int revealedCells = 0;

        while (!gameWon && !gameOver) {
            printBoard(board);
            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            if (!isValidCoordinate(row, col)) {
                System.out.println("Geçersiz koordinat, tekrar deneyin.");
                continue;
            }

            if (!board[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (isMine(row, col)) {
                gameOver = true;
                System.out.println("Game Over!!");
            } else {
                int adjacentMines = countAdjacentMines(row, col);
                board[row][col] = String.valueOf(adjacentMines);
                revealedCells++;

                if (revealedCells == (rows * cols - mineCount)) {
                    gameWon = true;
                    System.out.println("Oyunu Kazandınız !");
                }
            }
        }

        printBoard(mines);
    }
}
