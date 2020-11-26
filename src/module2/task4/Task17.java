package module2.task4;

/*
Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        int number = generateNumber();
        System.out.println("Сгенерированное число: " + number);
        System.out.println("Количество итераций для приведения к нулю: " + count(number));
    }

    public static int generateNumber() {
        return (int) (Math.random() * 1000);
    }

    public static int sum(int number) {
        int sum = 0;
        int lengthNumber = Integer.toString(number).length();
        for (int j = 0; j < lengthNumber; j++) {
            int modul = number % 10;
            number /= 10;
            sum += modul;
        }
        return sum;
    }

    public static int count(int number){
        int count = 0;
        while(number > 0){
            number -= sum(number);
            count++;
        }
        return count;
    }
}
