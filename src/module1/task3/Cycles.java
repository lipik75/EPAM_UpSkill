package module1.task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cycles {

    //1.Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
    int sumOfNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое положительное число");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //2.Вычислить значения функции на отрезке [а,b] c шагом h:

    int functionValueOnSegment(int a, int b, int h) {
        int sum = 0;
        for (int i = a; i <= b; i += h) {
            sum += i;
        }
        return sum;
    }
    //3.Найти сумму квадратов первых ста чисел.

    int sumOneHundred() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
    //4.Составить программу нахождения произведения квадратов первых двухсот чисел.

    Object multiplicationTwoNundred() {

        BigInteger mult = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            mult = mult.multiply(BigInteger.valueOf((long) i * i));
        }
        return mult;
    }

    //5.Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    void elementOfNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " = " + Character.getType(i)); // Честно говоря не совсем понимаю заданию, между чем нужно провести соответствие
        }
    }
    //6.Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

    void divisions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = sc.nextInt();
        System.out.println("Введите число n");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) { // проверить, делится ли число..
                if (i % j == 0) {
                    list.add(i);
                    break;
                }
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    //7.Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    void twoDigital(int a, int b) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int str1 = Integer.toString(a).length();
        int str2 = Integer.toString(b).length();
        for (int i = 0; i < str1; i++) {
            int z;
            z = a % 10;
            a = a / 10;
            list1.add(z);
        }
        for (int i = 0; i < str2; i++) {
            int z;
            z = b % 10;
            b = b / 10;
            list2.add(z);
        }

        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}