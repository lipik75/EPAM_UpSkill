package module4.task1;

/**
 * Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */

public class Test1 {
    private int a = 1;
    private int b = 2;

    public void printVar() {
        System.out.printf("a = %d, b = %d", a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        if (a > b) {
            return a;
        }
        return b;
    }
}

class CheckTest1 {
    public static void main(String[] args) {
        Test1 one = new Test1();

        one.printVar();
        System.out.println("\nСуммма: " + one.getSum());
        System.out.println("Максимум: " + one.getMax());

        System.out.print("\nСмена переменных:");
        one.setA(20);
        one.setB(5);

        System.out.println();
        one.printVar();
        System.out.println("\nСуммма: " + one.getSum());
        System.out.println("Максимум: " + one.getMax());
    }
}
