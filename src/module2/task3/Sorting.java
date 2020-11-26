package module2.task3;

import java.util.Arrays;

public class Sorting {

    /*
    1.Заданы два одномерных массива с различным количеством элементов и натуральное число k.
      Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
      при этом не используя дополнительный массив.
     */
    public void unionOfArrays(int[] arr1, int[] arr2, int k) {
        int count = 0;
        int[] sum = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < sum.length; i++) {
            if (i == k) {
                for (int j = 0; j < arr2.length; j++) {
                    sum[k] = arr2[j];
                    k++;
                    i++;
                }
            } else {
                sum[i] = arr1[count];
                count++;
            }
        }
        for (int x : sum) {
            System.out.print(x + " ");
        }
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    //2. Реализуйте сортировку выбором.

    public void selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    //3.  Реализуйте сортировку обменами.

    public void bubbleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //4. Реализуйте сортировку вставками.

    public void insertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    //5. Реализуйте сортировку Шелла.

    public void shellSort(int[] array) {
        // Высчитываем промежуток между проверяемыми элементами
        int gap = array.length / 2;
        // Пока разница между элементами есть
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // Смещаем правый указатель, пока не сможем найти такой, что
                // между ним и элементом до него не будет нужного промежутка
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // Пересчитываем разрыв
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }
}
