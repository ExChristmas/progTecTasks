package arrays;

// Для произвольной цифры от 0 до 9
// вывести на консоль ее значение прописью.
// Например, для цифры 9 на консоли должна быть
// напечатана строка «Девять».

import java.util.Scanner;

public class task7 {

    private static String[] numbers() {
        String[] nums = new String[10];
        nums[0] = "Ноль";
        nums[1] = "Один";
        nums[2] = "Два";
        nums[3] = "Три";
        nums[4] = "Четыре";
        nums[5] = "Пять";
        nums[6] = "Шесть";
        nums[7] = "Семь";
        nums[8] = "Восемь";
        nums[9] = "Девять";
        return nums;
    }

    public static void main(String[] args) {
        String[] nums = numbers();
        System.out.println("Введите цифру:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(nums[scanner.nextInt()]);
    }
}