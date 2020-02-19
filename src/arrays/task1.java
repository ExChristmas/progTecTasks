package arrays;

// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести четные и нечетные числа.

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}