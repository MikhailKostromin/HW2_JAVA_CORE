import java.util.Arrays;
import java.util.TreeMap;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 2, 6, 9, 10, 1, 2, 5, 4, 9, 6, 20};

        System.out.println("Исходный: " + Arrays.toString(arr));
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr){
        int[] tmpArr = new int[arr.length];

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            // if(map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }
        }
        System.out.println("Map:" + map.toString());

        int i = 0;
        for (Integer key : map.keySet()) {
            for (int j = 0; j < map.get(key); j++) {
                tmpArr[i++] = key;
            }
        }
        return tmpArr;
    }
}