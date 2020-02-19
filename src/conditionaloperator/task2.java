package conditionaloperator;

// Рассчитать надбавку к зарплате за стаж, если стаж от 2 до 5 лет,
// надбавка составляет 2%, если стаж от 5 до 10 лет - 5%.
// Ввести с клавиатуры зарплату и стаж, вывести надбавку и сумму к выплате.

import java.util.Scanner;

public class task2 {

    private static double premium(int sal, int exp) {
            if (exp >= 2 && exp <= 5) {
                return sal * 0.02;
            } else if (exp >= 5 && exp <= 10) {
                return sal * 0.05;
            } else {
                return 0;
            }
    }

    public static void main(String[] args) {
        System.out.println("Введите зарплату:");
        Scanner scanner = new Scanner(System.in);
        int sal = scanner.nextInt();
        System.out.println("Введите стаж");
        int exp = scanner.nextInt();
        double prem = premium(sal,exp);
        System.out.println("Надбавка: " + prem + "\nСумма к выплате: " + ((double)sal + prem));
    }
}
