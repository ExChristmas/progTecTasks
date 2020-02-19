package loopoperators1;

// Найти все числа кратные пяти для чисел от 1 до N.

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Введите N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while(i <= n) {
            if ((i % 5) == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}