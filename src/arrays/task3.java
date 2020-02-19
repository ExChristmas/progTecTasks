package arrays;

// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести числа, которые делятся на 5 или на 10.

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        int el;
        for (int i = 0; i < n; i++) {
            el = arr[i];
            if (el % 5 == 0) {
                System.out.print(el + " ");
            }
        }
    }
}