package Diziler;

public class DizilerdeFrekansBulanProgram {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequency = new int[array.length];
        boolean[] counted = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (counted[i]) continue;
            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    counted[j] = true;
                }
            }

            frequency[i] = count;
        }

        for (int i = 0; i < array.length; i++) {
            if (!counted[i]) {
                System.out.println(array[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}


