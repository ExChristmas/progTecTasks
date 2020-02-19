package loopoperators2;

// Даны два целых числа A и B (A < B).
// Найти все целые числа, расположенные
// между данными числами (не включая сами эти числа),
// в порядке их убывания, а также количество N этих чисел.

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Введите левую границу:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите правую границу:");
        int b = scanner.nextInt();
        try {
            if (a > b) {
                throw new Exception("");
            }
            int n = 0;
            for (int i = b; i >= a; i--) {
                System.out.println(i);
                n++;
            }
            System.out.println("Количество чисел: " + n);
        } catch (Exception ignore) {
            System.out.println("Левая граница больше правой");
        }
    }
}