package module2.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneDimensionalArrays {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public int summNumbersMultiplicityK(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    //2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

    public int changeNumbersMoreThanZ(double[] arr, int z) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }
        return count;
    }

    //3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

    public void numbersOfarrays(double[] arr) {
        int moreZero = 0;
        int zero = 0;
        int lessZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                moreZero++;
            }
            if (arr[i] == 0) {
                zero++;
            }
            if (arr[i] < 0) {
                lessZero++;
            }
        }
        System.out.println("Количество отрицательных чисел: " + lessZero + ", количество положительных чисел: " + moreZero + ", количество нулевых чисел: " + zero);
    }

    //4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

    public void changeBigAndSmallNumbers(double[] arr) {
        int bigNumber = 0;
        int smallNumber = 0;
        double big = 0;
        double small = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[smallNumber] > arr[i]) {
                smallNumber = i;
                small = arr[smallNumber];
            }
            if (arr[bigNumber] < arr[i]) {
                bigNumber = i;
                big = arr[bigNumber];
            }
        }
        arr[smallNumber] = big;
        arr[bigNumber] = small;
        System.out.println(Arrays.toString(arr));
    }

    // 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
    public void numbersBiggerThanI(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    //6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами.

    public double primeNumbers(double[] arr) {
        double summ = arr[0] + arr[1]; // если учесть что 0 и 1 - простые числа
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                summ += arr[i];
        }
        return summ;
    }

    //7. Даны действительные числа а1 ,а2 ,..., аn. Найти max()

    public double getMaxSum(double[] arr) {
        double maxSum = arr[0] + arr[arr.length - 1];
        for (int i = 1; i < arr.length / 2; i++) {
            if ((arr[i] + arr[arr.length - i - 1]) > maxSum) {
                maxSum = arr[i] + arr[arr.length - i - 1];
            }
        }
        return maxSum;
    }

    //8.Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

    public void deleteMinValue(int[] arr) {
        int minCount = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        for (int value : arr) {
            if (value == min) {
                minCount++;
            }
        }
        int[] result = new int[arr.length - minCount];
        int indexResult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                result[indexResult] = arr[i];
                indexResult++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.

    public int getOftenNumber(int[] arr) {
        int[] arrCopy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arrCopy[i]++;
                }
            }
        }
        int valResult = arr[0];
        int popResult = arrCopy[0];
        for (int i = 0; i < arrCopy.length; i++) {
            if (arrCopy[i] > popResult) {
                popResult = arrCopy[i];
                valResult = arr[i];
            }
            if ((popResult == arrCopy[i]) && (arr[i] < valResult)) {
                valResult = arr[i];
            }
        }
        return valResult;
    }

    //10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
    public void getIt(int[] arr) {

        int count = 1;

        for (int i = 2; i < arr.length; i += 2) {
            arr[count] = arr[i];
            count++;
        }
        if (arr.length % 2 == 0) {
            arr = Arrays.copyOf(arr, arr.length / 2);
        } else {
            arr = Arrays.copyOf(arr, arr.length / 2 + 1);
        }
        System.out.println(Arrays.toString(arr));
    }
}