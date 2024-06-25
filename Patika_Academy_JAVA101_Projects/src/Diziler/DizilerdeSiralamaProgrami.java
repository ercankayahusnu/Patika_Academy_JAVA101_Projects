package Diziler;

import java.util.Arrays;

public class DizilerdeSiralamaProgrami {

    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int target = 5;

        int[] nearestNumbers = findNearestNumbers(array, target);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestNumbers[0]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestNumbers[1]);
    }

    public static int[] findNearestNumbers(int[] array, int target) {
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < target && num > closestSmaller) {
                closestSmaller = num;
            }
            if (num > target && num < closestLarger) {
                closestLarger = num;
            }
        }

        return new int[]{closestSmaller, closestLarger};
    }

}
