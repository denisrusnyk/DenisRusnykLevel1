/**
 * Дана последовательность действительных чисел.
 * Выяснить, отсортирован ли он по возрастанию.
 */


public class Main4 {

    public static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {0, 5, 8};
        System.out.println(isAscending(array));
    }

}