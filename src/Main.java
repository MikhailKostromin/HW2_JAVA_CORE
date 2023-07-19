import java.util.Arrays;

/**
 * Задача:  Написать функцию добавления элемента в конец массива таким образом,
 * чтобы она расширяла массив при необходимости.
 */

public class Main {

    public class Task1 {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5, 6};
            int num = 7;
            //int resultArr[] = addLast(arr, num);
            int[] resultArr = addIndex(arr, num, 0);

            System.out.println("Исходный массив: " + Arrays.toString(arr));
            System.out.println("Результат: " + Arrays.toString(resultArr));

        }

        public static int[] addLast(int[] arr, int num) {

            int[] tmpArr = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                tmpArr[i] = arr[i];
            }
            tmpArr[arr.length] = num;
            return tmpArr;
        }

        public static int[] addIndex(int[] arr, int num, int index) {

            if (!(index >= 0 && index <= arr.length)) {
                System.out.println("Индекс за пределами исходного массива");
                return null;
            } else if (index == arr.length) {
                return addLast(arr, num);
            } else {
                int[] tmpArr = new int[arr.length + 1];
                int tmp = 0;

                for (int i = 0; i < arr.length + 1; i++) {
                    if (i == index) {
                        tmpArr[i] = num;
                        tmp++;
                    } else {
                        tmpArr[i] = arr[i - tmp];
                    }
                }
                return tmpArr;
            }

        }


    }
}