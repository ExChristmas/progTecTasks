package conditionaloperator;

// Ввести с экрана число от 1 до 12. По номеру месяца выдать
// сообщение о времени года. Если пользователь введет недопустимое
// число, программа должна выдать сообщение об ошибке.

import java.util.Scanner;
import java.util.InputMismatchException;

public class task6 {

    public static void main(String[] args) {
        System.out.println("Введите номер месяца:");
        Scanner scanner = new Scanner(System.in);
        try {
            int mm = scanner.nextInt();
            if (mm == 1 || mm == 2 || mm == 12) {
                System.out.println("Зима");
            } else if (mm >= 3 && mm <= 5) {
                System.out.println("Весна");
            } else if (mm >= 6 && mm <= 8) {
                System.out.println("Лето");
            } else if (mm >= 9 && mm <= 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Ошибка. Нет месяцы с таким номером");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        }
    }
}
