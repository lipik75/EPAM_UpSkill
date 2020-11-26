package module2.task4;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
Для решения задачи использовать декомпозицию.
 */

public class Task14 {

    public static void main(String[] args) {
        int number = generateNumber();
        showNumber(number);
        System.out.println("Число состоит из цифр: ");
        showDigitsAtNumber(number);
        int sum = sumDigitsAtNumber(number);
        System.out.println("Сумма цифр из числа возведенных в степень равна: " + sum);
        isArmstrongNumber(number, sum);
    }

    public static int generateNumber() {
        return (int) (10 + Math.random() * 200);
    }

    public static void showNumber(int n) {
        System.out.println(n);
    }

    public static void showDigitsAtNumber(int n) {
        int lengthNumber = Integer.toString(n).length();
        for (int i = lengthNumber - 1; i >= 0; i--) {
            int modul = n % 10;
            n /= 10;
            System.out.print(modul + " ");
        }
        System.out.println();
    }

    public static int sumDigitsAtNumber(int n) {
        int sum = 0;
        int lengthNumber = Integer.toString(n).length();
        for (int i = lengthNumber - 1; i >= 0; i--) {
            int modul = n % 10;
            n /= 10;
            sum += Math.pow(modul, lengthNumber);
        }
        return sum;
    }

    public static void isArmstrongNumber(int n, int sum) {
        if (sum == n) {
            System.out.println("Натуральное число " + n + " является числом Армстронга");
        } else {
            System.out.println("Натуральное число " + n + "  не является числом Армстронга");
        }
    }
}
