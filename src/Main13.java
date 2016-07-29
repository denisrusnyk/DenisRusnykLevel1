/**
 * Дан массив чисел. Найти: mаx(a[0],a[2],...,a[2k]) +min (a[1],a[3],..., a[2k-1]).
 */
public class Main13 {

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 2, 1};
        System.out.println(minMaxSum(array, 10));
    }

    public static int minMaxSum(int[] array, int limit) {
        limit *= 2;
        if (limit > array.length) {
            limit = array.length;
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < limit; i++) {
            maxIndex = array[i] > array[maxIndex] ? i : maxIndex;
        }

        for (int i = 0; i < limit - 1; i++) {
            minIndex = array[i] < array[minIndex] ? i : minIndex;
        }

        return array[maxIndex] + array[minIndex];
    }
}