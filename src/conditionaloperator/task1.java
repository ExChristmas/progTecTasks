package conditionaloperator;

//Ввести с клавиатуры два числа. Определить,
// что больше, сумма квадратов или квадрат суммы этих чисел.
// Ответ вывести в виде сообщения.

import java.util.Scanner;

public class task1 {

    private static int sumOfSquare(int x, int y) {
        return x * x + y * y;
    }

    private static int squareOfSum(int x, int y) {
        return (int)Math.pow(x + y, 2);
    }

    public static void main(String[] args) {
        System.out.println("Введие первое число:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Введие второе число:");
        int num2 = scanner.nextInt();
        if (sumOfSquare(num1, num2) > squareOfSum(num1, num2)) {
            System.out.println("Сумма квадратов больше");
        } else if (sumOfSquare(num1, num2) < squareOfSum(num1, num2)) {
            System.out.println("Квадрат суммы больше");
        } else {
            System.out.println("Сумма квадратов и квадрат суммы равны");
        }
    }
}
