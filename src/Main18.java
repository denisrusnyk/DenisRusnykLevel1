import java.util.Arrays;

/**
 * Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся на цифру k.
 */
public class Main18 {

    public static void main(String[] args) {
        int[] array = {1005, 10, 15, 5, 25, 105, 103, 21};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(endFrequency(array, 1)));
    }

    public static int[] endFrequency(int[] array, int digit) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == digit) {
                counter++;
            }
        }

        int[] result = new int[counter];

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == digit) {
                result[counter++] = array[i];
            }
        }
        return result;
    }

}