package arrays;

// Ввести с консоли n целых чисел и поместить их в массив.
// На консоль вывести наибольший общий делитель и наименьшее
// общее кратное этих чисел.

import java.util.Scanner;

public class task4 {

    private static int nod(int x, int y) {
        while (x != y)
        {
            if (x > y)
                x = x - y;
            else
                y = y - x;
        }
        return x;
    }

    private static int nodOfNumbers(int[] mas, int n, int i, int x) {
        if (i == n)
            return x;
        int nod = nod(x, mas[i]);
        i++;
        return nodOfNumbers(mas, n, i, nod);
    }

    private static int nok(int x, int y){
        return x / nod(x, y) * y;
    }

    private static int nokOfNumbers(int[] mas, int n, int i, int x) {
        if (i == n)
            return x;
        int nok = nok(x, mas[i]);
        i++;
        return nodOfNumbers(mas, n, i, nok);
    }

    public static void main(String[] args) {
        System.out.print("N = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.print("Введите числа через пробел: ");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.printf("НОД = %d\n", nodOfNumbers(a, n, 1, a[0]));
        System.out.printf("НОК = %d", nokOfNumbers(a, n, 1, a[0]));
    }
}