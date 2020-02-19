package loopoperators2;

// Дано вещественное число A и целое число N (> 0).
// Найти все целые степени числа A от 1 до N.

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        System.out.println("Введите вещественное число:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите степень:");
        int n = scanner.nextInt();
        double num = a;
        while (a <= n) {
            a *= num;
            for (int i = 1; i <= n; i++) {
                if (i == a) {
                    System.out.println(i);
                }
            }
        }
    }
}