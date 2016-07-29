import java.util.Arrays;

/**
 * Дан массив положительных и отрицательных чисел.
 * Заменить нулями те числа, величина которых по модулю больше максимального числа (|a[i]| > max{ a[0], a[1], ..., a[n]})
 */
public class Main15 {

    public static void main(String[] args) {
        int[] array = {1, 12, 1, -30, 15, 0, 7, 8, -20, 4, 18, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceByZeroIfGreaterThanMax(array)));
    }

    public static int[] replaceByZeroIfGreaterThanMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            max = element > max ? element : max;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.abs(array[i]) > max) ? 0 : array[i];
        }
        return array;
    }

}