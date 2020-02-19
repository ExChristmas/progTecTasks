package loopoperators2;

// Дано вещественное число A и целое число N (> 0).
// Найти A в степени N: AN = A•A••A (числа A перемножаются N раз) .

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        System.out.println("Введите вещественное число:");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите степень:");
        int n = scanner.nextInt();
        double num = a;
        for (int i = 1; i < n; i++) {
            a *= num;
        }
        System.out.println("Число " + num + " в степени " + n + ": " + a);
    }
}
