package loopoperators1;

// Найти все числа некратные пяти и кратные 3,
// и сумма цифр которых также некратна пяти и кратна 3.

public class task1 {

    private static boolean checkFreqRate(int number) {
        return (number % 5) != 0 && (number % 3) == 0;
    }

    public static void main(String[] args) {
        int number = -2147483648, sum = 0, n;
        while(number < 2147483647) {
            if (checkFreqRate(number)) {
                n = number;
                while(n != 0) {
                    sum += (n % 10);
                    n /= 10;
                }
                if (checkFreqRate(sum)) {
                    System.out.println(number);
                }
                sum = 0;
            }
            number++;
        }
    }
}