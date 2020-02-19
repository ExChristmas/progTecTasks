package loopoperators1;

// В 1202г итальянский математик Леонард Пизанский (Фибоначчи)
// предложил такую задачу: пара кроликов каждый месяц дает приплод – двух кроликов
// (самца и самку), от которых через два месяца уже получается новый приплод.
// Сколько кроликов будет через год, если в начале года имелась одна пара?
// Согласно условию задачи числа, соответствующие количеству кроликов,
// которые появляются через каждый месяц, составляют последовательность
// 1, 1, 2, 3, 5, 8, 13, 21, 34, … Составьте программу, позволяющую найти
// все числа Фибоначчи, меньшие заданного числа N.

import java.util.Scanner;

public class task4 {

    private static void fibonacci (int n) {
        int i1 = 1, i2 = 1, i = 0;
        while (i <= n) {
            i = i2 + i1;
            System.out.println(i);
            i1 = i2;
            i2 = i;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fibonacci(n);
    }
}
