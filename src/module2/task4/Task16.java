package module2.task4;

import java.util.Arrays;

/*
   Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
   Определить также, сколько четных цифр в найденной сумме.
   Для решения задачи использовать декомпозицию.
*/
public class Task16 {

    public static void main(String[] args) {
        int[] arr = generateArray(5);
        showArrayNumbers(arr);
        int sum = sumOfNumbers(arr);
        System.out.println("Сумма чисел равна "+ sum);
        System.out.println("Количество четных цифр в сумме " + howDigitsInSum(sum));
    }

    public static int generateNumber() {
        int n = (int) (10 + Math.random() * 1000);
        int number = n;
        int count = 0;
        int lengthNumber = Integer.toString(n).length();
        for (int j = 0; j < lengthNumber; j++) {
            int modul = n % 10;
            n /= 10;
            if (modul == 0 || modul % 2 != 0) {
                break;
            } else {
                count++;
            }
        }
        if (count == Integer.toString(number).length()) {
            return number;
        } else {
            return generateNumber();
        }
    }

    public static int[] generateArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generateNumber();
        }
        return arr;
    }

    public static void showArrayNumbers(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int sumOfNumbers(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int howDigitsInSum(int sum) {
        int count = 0;
        int lengthSum = Integer.toString(sum).length();
        for (int i = 0; i < lengthSum; i++) {
            int modul = sum % 10;
            sum /= 10;
            if (modul % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
