package Diziler;

import java.util.*;

public class DizilerdeTekrarEdenSayilariBulanProgram {

    public static List<Integer> findRepeatedEvenNumbers(int[] numbers) {
        Map<Integer, Integer> evenCount = new HashMap<>();
        List<Integer> repeatedEvens = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount.put(num, evenCount.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : evenCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedEvens.add(entry.getKey());
            }
        }

        return repeatedEvens;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 2, 4, 4, 6, 8, 10, 10, 12};
        List<Integer> result = findRepeatedEvenNumbers(numbers);
        System.out.println("Tekrar eden çift sayılar: " + result);
    }
}

