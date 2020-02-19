package conditionaloperator;

// Ввести с клавиатуры три числа,
// положительные возвести в квадрат,
// а отрицательные оставить без изменений.

import java.util.Scanner;

public class task5 {

    private static void squareOfPosNum(int x) {
        if (x > 0) {
            System.out.print((x * x) + "\n");
        } else {
            System.out.print(x + "\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите три числа (через пробел):");
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        try {
            for (String num : nums) {
                squareOfPosNum(Integer.parseInt(num));
            }
        } catch (Exception ignored) {
            System.out.println("Данные введены не верно!");
        }
    }
}
