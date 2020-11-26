package module2.task2;

public class Main {
    static int[][] array = {{9, 6, 3, 8},
                            {2, 4, 5, 1},
                            {8, 1, 0, 7},
                            {7, 6, 1, 9}};

    public static void main(String[] args) {
        ArraysOfArrays a = new ArraysOfArrays();

        System.out.println("exercise #1");
        a.odd(array);
        System.out.println("exercise #2");
        a.diagonalElements(array);
        System.out.println("exercise #3");
        a.stringKOddP(array);
        System.out.println("exercise #4");
        a.matrixOne(4);
        System.out.println("exercise #5");
        a.matrixTwo(6);
        System.out.println("exercise #6");
        a.matrixThree(4);
        System.out.println("exercise #7");
        a.matrixFour(5);
        System.out.println("exercise #8");
        a.changeColumns();
        System.out.println("exercise #9");
        a.summOfColumns();
        System.out.println("exercise #10");
        a.nuturalDiagonalElements();
        System.out.println("exercise #11");
        a.stringBiggerNumberFive();
        System.out.println("exercise #12");
        a.sortedMatrix();
        System.out.println("exercise #13");
        a.sortedColumnMatrix();
        System.out.println("exercise #14");
        a.matrizZeroAndOne();
        System.out.println("exercise #15");
        a.maxElementChange();
        System.out.println("exercise #16");
        a.magicSquare();

    }
}
