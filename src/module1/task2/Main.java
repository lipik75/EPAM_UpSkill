package module1.task2;

public class Main {
    public static void main(String[] args) {
        Branching branching = new Branching();

        System.out.println(branching.triangle(30, 20));
        System.out.println(branching.maximum(5, 12, 20, 3));
        System.out.println(branching.oneSameLine(1, 1, 2, 2, 3, 3));
        System.out.println(branching.pushBrick(2, 3, 5, 7, 10));
        System.out.println(branching.function(2));
    }
}
