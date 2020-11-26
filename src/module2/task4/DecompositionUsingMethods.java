package module2.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DecompositionUsingMethods {
    //метод для нахождение НОД (рекурсия)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    // 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:

    public void findNokAndNod(int a, int b) {
        int k = (a * b);
        int noD = gcd(a, b);
        int noK = k / noD;
        System.out.println("Наибольший общий делитель: " + noD + " Наименьшее общее кратное: " + noK);
    }

    //2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public void showNodfourNumbers(int a, int b, int c, int d) {
        System.out.println("НОД из 4 чисел: " + gcd(gcd(a, b), gcd(c, d)));
    }

    //3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

    public void yardage(double a) {
        // a - длина стороны шестиугольника
        double s = ((3 * Math.sqrt(3)) / 2) * a * a; // площадь шестиугольника
        System.out.println("Площадь правильного шестиугольника равна: " + s);
    }
    //4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
    // между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

    public void maxLengthBetweenDot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int n = sc.nextInt();
        int[] dotX = new int[n];
        int[] dotY = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите координату Х: ");
            dotX[i] = sc.nextInt();
            System.out.println("Введите координату Y: ");
            dotY[i] = sc.nextInt();
        }
        double length, lengthMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                length = 0;
                if (i != j) {
                    length = Math.sqrt(Math.pow((dotX[j] - dotX[i]), 2) + Math.pow((dotY[j] - dotY[i]), 2));
                    if (lengthMax < length) {
                        lengthMax = length;
                    }
                }
            }
        }
        System.out.println("Максимальное расстояние между точками: " + lengthMax);
    }

    //5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    // которое меньше максимального элемента массива, но больше всех других элементов).

    public void seconMaxDigit() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Сгенерированный массив:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(array[n - 2]);
    }

    //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    //Числа являются взаимно простыми, если их наибольший общий делитель равен 1.
    public void simpleDigits(int a, int b, int c) {
        int n = gcd(gcd(a, b), c);
        if (n == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не являются взаимно простыми");
        }
    }

    //7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public void factorialNumbers() {
        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = 1; j < i; j++) {
                factorial *= j;
            }
            sum += factorial;
            factorial = 1;
        }
        System.out.println("Сумма факториалов чисел от 1 до 9 равно: " + sum);
    }

    //8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

    public void sumDigitsToArray() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Введите номер элемента массива: ");
        int k = sc.nextInt();
        int m = k + 2;
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i - 1];
        }
        System.out.println("Сумма трех последовательно расположенных элементов массива: " + sum);
    }

    // 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
    // Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    // X, Z - длина, Y, T - ширина
    // Площадь прямоугольного треугольника равна половине произведения катетов треугольника
    public void areaRectangle(double X, double Y, double Z, double T) {
        double k1 = Y;
        double k2 = Z - X;
        double s = X * Y + (k1 * k2) / 2; // сумма площадей прямоугольника и прямоугольного треугольника
        System.out.println("Площать четырехугольника равна: " + s);
    }

    //10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

    public void arrayOfNumber(int n) {
        int lengthArray = Integer.toString(n).length();
        int[] array = new int[lengthArray];
        for (int i = lengthArray - 1; i >= 0; i--) {
            int modul = n % 10;
            n /= 10;
            array[i] = modul;
        }
        System.out.println(Arrays.toString(array));
    }
    //11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

    public void biggerNumbersLength(int a, int b) {
        int lengthA = Integer.toString(a).length();
        int lengthB = Integer.toString(b).length();
        if (lengthA > lengthB)
            System.out.println("В числе " + a + " больше цифр чем в числе " + b);
        else
            System.out.println("В числе " + b + " больше цифр чем в числе " + a);
    }
    //12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
    // сумма цифр которых равна К и которые не большее N.

    public void generateArrayA(int k, int n) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int sum;
        int number;
        System.out.println("Введите длину массива: ");
        int lengthArray = sc.nextInt();
        int[] A = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            sum = 0;
            while (sum != k) {
                number = random.nextInt(100);
                int digit = number;
                if (digit < n) {
                    sum = 0;
                    for (int j = 0; j < Integer.toString(digit).length(); j++) {
                        int modul = number % 10;
                        number /= 10;
                        sum += modul;
                    }
                    if (sum == k) {
                        A[i] = digit;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }
}