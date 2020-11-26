package module2.task3;

public class Main {
    static int[] intArray = {1, 2, 3, 4, 5, 6, 7};
    static int[] intArray2 = {8, 9, 10, 11, 12};

    public static void main(String[] args) {
        Sorting s = new Sorting();

        System.out.println("Exercise #1");
        s.unionOfArrays(intArray, intArray2, 3);
        System.out.println("Exercise #2");
        int[] arr1 = {8, 9, 10, 8, 3, 1, 0, 5};
        s.selectionSort(arr1);
        System.out.println("Exercise #3");
        int[] arr2 = {8, 9, 10, 8, 3, 1, 0, 5};
        s.bubbleSort(arr2);
        System.out.println("Exercise #4");
        int[] arr3 = {8, 9, 10, 8, 3, 1, 0, 5};
        s.insertionSort(arr3);
        System.out.println("Exercise #5");
        int[] arr4 = {8, 9, 10, 8, 3, 1, 0, 5};
        s.shellSort(arr4);
    }
}
