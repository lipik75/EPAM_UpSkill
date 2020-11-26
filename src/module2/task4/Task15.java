package module2.task4;
/*
Найти все натуральные n-значные числа, цифры в которых образуют строго
возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int number = generateNumber();
        showNumber(number);
        int[] arr = arrayDigitsAtNumber(number);
        posledovatelnost(arr);
    }

    public static int generateNumber() {
        return (int) (100 + Math.random() * 1000);
    }

    public static void showNumber(int n) {
        System.out.println(n);
    }

    public static int[] arrayDigitsAtNumber(int n) {
        int lengthNumber = Integer.toString(n).length();
        int[] arr = new int[lengthNumber];
        for (int i = lengthNumber - 1; i >= 0; i--) {
            int modul = n % 10;
            n /= 10;
            arr[i] = modul;
        }
        return arr;
    }

    public static void posledovatelnost(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                System.out.println("Число не состоит из последовательно возрастающих цифр");
                break;
            }
            if (count == arr.length - 1) {
                System.out.println("Число состоит из последовательно возрастающих цифр");
            }
        }
    }
}
