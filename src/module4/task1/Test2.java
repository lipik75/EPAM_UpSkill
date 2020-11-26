package module4.task1;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
    private int a;
    private int b;

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Test2() {
        this.a = 1;
        this.b = 2;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

class CheckTest2 {

    public static void main(String[] args) {
        Test2 one = new Test2(12, 4);
        Test2 two = new Test2();

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());

        System.out.println("\nСмена переменных:");
        one.setA(20);
        one.setB(5);

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());
        System.out.println();
        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());

        System.out.println("\nСмена переменных:");
        two.setA(21);
        two.setB(2);

        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());
    }
}
