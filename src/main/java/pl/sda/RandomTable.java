package pl.sda;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        int[] table = fill(n);
        print(table);

        System.out.println("Czy tablica jest niemajejąca " + checkOrder(table, true));
        System.out.println("Czy tablica jest nierosnąca " + checkOrder(table, false));
    }

    private static boolean checkOrder(int[] table, boolean isGrater) {
        boolean result = true;

        for (int i = 1; i < table.length; i++) {
            if (isGrater && table[i] < table[i - 1]) {
                return false;
            }
            if (!isGrater && table[i] > table[i - 1]) {
                return false;
            }
        }

        return result;
    }

    private static void print(int[] table) {
        System.out.println(Arrays.toString(table));
    }

    private static int[] fill(int n) {
        int[] result = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }


}
