/**
 * Написать метод, принимающий на вход массив чисел и параметр n.
 * Метод должен осуществить циклический (последний элемент при сдвиге становится первым)
 * сдвиг всех элементов массива на n позиций;
 */

public class WhileShift {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        int position = 2;

        swapsTheElementOfAnArray(arrays, position);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

    public static void swapsTheElementOfAnArray(int[] array, int position) {
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                int n = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = n;
            }
        } else {
            for (int i = 0; i > position; i--) {
                int n = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = n;
            }
        }
    }
}
