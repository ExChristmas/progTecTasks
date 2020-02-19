package loopoperators1;

// Является ли заданное натуральное число степенью двойки?

import java.util.Scanner;

public class task3 {

    private static boolean powOf2(int n) {
        int i = 2;
        while (i <= n) {
            if (i == n) {
                return true;
            }
            i *= 2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (powOf2(number)) {
            System.out.println("Да, является");
        } else {
            System.out.println("Нет, не является");
        }
    }
}
