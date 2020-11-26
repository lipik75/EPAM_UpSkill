package module2.task2;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysOfArrays {

    // 1.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

    public void odd(int[][] matrixA) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        for (int[] ints : matrixA) {
            for (int j = 0; j < n; j += 2) {
                if ((matrixA[0][j] > matrixA[matrixA.length - 1][j])) {
                    System.out.print(ints[j] + "\t");
                }
            }
            System.out.println();
        }
    }

    //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

    public void diagonalElements(int[][] matrixA) {
        int j = 0;
        for (int[] ints : matrixA) {
            System.out.print(ints[j] + "\t");
            j++;
            System.out.println();
        }
    }

    //3.Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

    public void stringKOddP(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Строка:");
        int k = sc.nextInt();
        System.out.println("Столбец: ");
        int p = sc.nextInt();
        for (int i = k; i < arr.length; i++) {
            System.out.println(arr[i][p] + "\t");
        }
        System.out.println();
    }

    //4.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public void matrixOne(int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = mat[j].length - j;
                }
            }
        }
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
    //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public void matrixTwo(int n) {
        int[][] mat = new int[n][n];
        int x = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = x;
            }
            x++;
            n--;
        }
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
    //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    public void matrixThree(int n) {
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j <= mat.length / 2) {
                    if (j >= mat.length - 1 - i || j >= i)
                        mat[i][j] = 1;
                    else
                        mat[i][j] = 0;
                } else {
                    if (i >= j || j <= mat.length - 1 - i)
                        mat[i][j] = 1;
                    else
                        mat[i][j] = 0;
                }
            }
        }
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
    //7. Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней.

    public void matrixFour(int n) {
        double N = 0.000000000000000000009;
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) Math.sin(((i * i) - (j * j)) / N);
            }
        }
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }

    //8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    // на соответствующие им позиции другого, а его элементы второго переместить в первый.
    // Номера столбцов вводит пользователь с клавиатуры.

    public void changeColumns() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину сторон матрицы:");
        int n = sc.nextInt();
        System.out.println("Сгенерированная матрица:");
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        int change;
        System.out.println("Введите номера столбов, которые необходимо поменять:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            change = mat[i][n1 - 1];
            mat[i][n1 - 1] = mat[i][n2 - 1];
            mat[i][n2 - 1] = change;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

    public void summOfColumns() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны матрицы:");
        int n = sc.nextInt();
        System.out.println("Сгенерированная матрица");
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = random.nextInt(10);
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        int count = 0;

        for (int j = 0; j < n; j++) {
            int s = 0;
            for (int i = 0; i < n; i++) {
                s += mat[i][j];
                if (s > sum) {
                    sum = s;
                    count = j;
                }
            }
        }
        System.out.println("Столбец: " + (count + 1) + " Сумма " + sum);
    }

    //10. Найти положительные элементы главной диагонали квадратной матрицы.

    public void nuturalDiagonalElements() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны матрицы:");
        int n = sc.nextInt();
        System.out.println("Сгенерированная матрица");
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = (int) (Math.random() * 20) - 10;
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (mat[i][i] > 0) {
                System.out.print(mat[i][i] + " ");
            }
        }
    }

    //11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

    public void stringBiggerNumberFive() {
        Random random = new Random();
        int numberString = 0;
        System.out.println("Сгенерированная матрица: ");
        int[][] mat = new int[10][20];
        int[] row = new int[10];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = random.nextInt(16);
                System.out.print(mat[i][j] + "\t");
                if (mat[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                row[numberString] = i + 1;
                numberString++;
            }
            System.out.println();
        }
        System.out.println("Строки в которых 3 и более раз встречается цифра 5: ");
        for (int i = 0; i < numberString; i++) {
            System.out.printf("%d", row[i]);
        }
    }

    //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public void sortedMatrix() {
        Random random = new Random();
        System.out.println("Сгенерированная матрица: ");
        Integer[][] mat = new Integer[7][8];
        int a = mat.length; // колиечтво строк
        int b = mat[0].length; // длина строки
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j] = random.nextInt(10);
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            bubbleSort(mat[i]);
        }
        System.out.println("----------------");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(Integer[] numArray) {
        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
    }
    // 13. Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов.

    public void sortedColumnMatrix() {
        Random random = new Random();
        System.out.println("Сгенерированная матрица: ");
        Integer[][] mat = new Integer[7][7];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(10);
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int k = 0; k < mat.length - 1; k++) {
                if (mat[k][1] < mat[k + 1][1]) {
                    temp = mat[k][1];
                    mat[k][1] = mat[k + 1][1];
                    mat[k + 1][1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println("-----------------------");
        for (Integer[] integers : mat) {
            IntStream.range(0, mat.length).mapToObj(j -> integers[j] + "\t").forEach(System.out::print);
            System.out.println();
        }
    }
    // 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

    public void matrizZeroAndOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину сторон");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Сгенерированная матрица: ");
        int[][] mat = new int[m][n];
        int count;
        for (int i = 0; i < mat.length; i++) {
            count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (count <= i) {
                    mat[i][j] = 1;
                    count++;
                } else {
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

    public void maxElementChange() {
        Random random = new Random();
        System.out.println("Сгенерированная матрица: ");
        Integer[][] mat = new Integer[7][7];
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = random.nextInt(50);
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Maximum " + max);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] % 2 != 0) {
                    mat[i][j] = max;
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
    // так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.

    public void magicSquare() {
        System.out.println("Сгенерированная матрица: ");
        int[][] mat = new int[6][6];
        int count = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = count;
                count++;
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Магический квадрат: ");
        int num = 0;
        for (int i = 0; i < mat.length / 2; i++) {
            int transition;
            transition = mat[i][i];
            mat[i][i] = mat[mat.length - 1 - num][mat.length - 1 - num];
            mat[mat.length - 1 - num][mat.length - 1 - num] = transition;
            num++;
        }
        num = 0;
        for (int i = 0; i < mat.length / 2; i++) {
            int transition;
            transition = mat[mat.length - 1 - num][i];
            mat[mat.length - 1 - num][i] = mat[i][mat.length - 1 - num];
            mat[i][mat.length - 1 - num] = transition;
            num++;
        }
        for (int[] integers : mat) {
            IntStream.range(0, mat.length).mapToObj(j -> integers[j] + "\t").forEach(System.out::print);
            System.out.println();
        }
    }
}
