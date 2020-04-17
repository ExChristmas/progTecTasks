package arrays;

// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести "счастливые" числа.

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        System.out.printf("Введите %d чисел: ", n);
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.print("Счастливые числа: ");
        for (int i = 0; i < n; i++) {

            int p = 0;
            int numCop = a[i];
            while (p < 7) {
                p++;
                int sum = 0;
                while (numCop != 0) {
                    sum += Math.pow(numCop % 10, 2);
                    numCop /= 10;
                }
                numCop = sum;

                if (sum == 1) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}