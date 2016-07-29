
import java.util.Arrays;

/**
 * Дан массив чисел. Среди них есть равные. Найти первый максимальный элемент массива и заменить его нулем.
 */
public class Main17 {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, -31, 12, -5, -47, 18, 40, -30, -1, -10};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceFirstMaxWithZero(array)));
    }

    public static int[] replaceFirstMaxWithZero(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                array[i] = 0;
                break;
            }
        }
        return array;
    }

}