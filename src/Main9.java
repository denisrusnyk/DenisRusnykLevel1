/**
 * Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i.
 */
public class Main9 {
    public static void main(String[] args) {
        int[] array = {2, 100, 13, -1, 7, 9, 11};
        printIfSmallerThanIndex(array);
    }

    public static void printIfSmallerThanIndex(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= i) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}