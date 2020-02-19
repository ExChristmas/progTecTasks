package conditionaloperator;

// Ввести с клавиатуры значения трех
// сторон треугольника a, b и c и определить,
// является ли он прямоугольным.
// Ответ вывести в виде сообщения.

import java.util.Scanner;

public class task4 {

    private static boolean teoremOfPifagor(int a, int b, int c) {
        return (a * a + b * b) == (c * c);
    }

    public static void main(String[] args) {
        System.out.println("Введите стороны треугольника (через пробел):");
        Scanner scanner = new Scanner(System.in);
        String[] sides = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sides[0]);
        int b = Integer.parseInt(sides[1]);
        int c = Integer.parseInt(sides[2]);
        if(teoremOfPifagor(a, b, c) || teoremOfPifagor(b, a, c) || teoremOfPifagor(b, c, a)
            || teoremOfPifagor(a, c, b) || teoremOfPifagor(c, a, b) || teoremOfPifagor(c, b, a)) {
            System.out.println("Треугольник является квадратным");
        } else {
            System.out.println("Треугольник не является квадратным");
        }
    }
}
