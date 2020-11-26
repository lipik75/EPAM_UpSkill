package module2.task1;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 5, 7, 9, 1, 12, -4, 3, 0, -4, -7, 99};
        double[] arrayDouble = {1, 2, 5, 7, 9, 12, -4, 3, 0, -7, 99};
        double[] arrayDoubleTwo = {1, 2, 5, 7, 9, 12, -4, 3, 0, -7, 99};

        OneDimensionalArrays o = new OneDimensionalArrays();

        System.out.println("exercise #1");
        System.out.println(o.summNumbersMultiplicityK(array, 3));
        System.out.println("exercise #2");
        System.out.println(o.changeNumbersMoreThanZ(arrayDoubleTwo, 2));
        System.out.println("exercise #3");
        o.numbersOfarrays(arrayDouble);
        System.out.println("exercise #4");
        o.changeBigAndSmallNumbers(arrayDouble);
        System.out.println("exercise #5");
        o.numbersBiggerThanI(array);
        System.out.println("exercise #6");
        System.out.println(o.primeNumbers(arrayDouble));
        System.out.println("exercise #7");
        System.out.println(o.getMaxSum(arrayDouble));
        System.out.println("exercise #8");
        o.deleteMinValue(array);
        System.out.println("exercise #9");
        System.out.println(o.getOftenNumber(array));
        System.out.println("exercise #10");
        o.getIt(array);
    }
}
