package pl.sda;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciChain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();

        long[] chain = fill(n);
        print(chain);
    }

    private static void print(long[] chain) {
        System.out.println(Arrays.toString(chain));
    }

    private static long[] fill(int n) {
        long[] result = new long[n];

        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }


}
