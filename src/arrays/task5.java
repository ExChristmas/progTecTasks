package arrays;

// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести простые числа.

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i);
            a[i] = scan.nextInt();
        }

        System.out.print("Простые числа: ");
        for (int i = 0; i < n; i++) {
            int el = a[i];
            boolean fl = true;
            for (int j = 2; j <= el/2+1; j++) {
                if (el % j == 0) {
                    fl = false;
                    break;
                }
            }
            if(fl) {
                System.out.printf("%d ", el);
            }
        }
    }
}