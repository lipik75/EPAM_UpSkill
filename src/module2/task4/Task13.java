package module2.task4;

import java.math.BigInteger;
import java.util.Arrays;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */

public class Task13 {
    public static void main(String[] args) {
        int[] a = generateArray(50);
        showArray(a);
        System.out.println("Все пары близнецов из данного массива:");
        showTwoPrimeNumbers(a);
    }

    public static int[] generateArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void showArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isPrime(int x) {
        BigInteger integer = BigInteger.valueOf(x);
        return integer.isProbablePrime((int) Math.log(x));
    }

    public static void showTwoPrimeNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int b = arr[i + 2];
            if (isPrime(a) && isPrime(b)) {
                System.out.print(a + " : " + b + " | ");
            }
        }
    }
}
