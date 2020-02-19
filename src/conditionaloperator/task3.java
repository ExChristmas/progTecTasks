package conditionaloperator;

// Ввести с клавиатуры координаты точек А (х0,у0) и В (х1,у1).
//  Определить, какая из точек А или В наиболее удалена от начала
//  координат (О(0,0)). Ответ вывести в виде сообщения.

import java.util.Scanner;

public class task3 {

    private static double distanceToO (int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        System.out.println("Введите координаты точки A (через пробел):");
        Scanner scanner = new Scanner(System.in);
        String[] cordA = scanner.nextLine().split(" ");
        int x0 = Integer.parseInt(cordA[0]);
        int y0 = Integer.parseInt(cordA[1]);
        System.out.println("Введите координаты точки B (через пробел):");
        String[] cordB = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(cordB[0]);
        int y1 = Integer.parseInt(cordB[1]);
        if (distanceToO(x0, y0) > distanceToO(x1, y1)) {
            System.out.println("Точка A наиболее удалена");
        } else if (distanceToO(x0, y0) < distanceToO(x1, y1)) {
            System.out.println("Точка B наиболее удалена");
        } else {
            System.out.println("Точки удалены одинаково");
        }
    }
}
