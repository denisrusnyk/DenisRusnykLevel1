import java.util.Arrays;

/**
 * Дан массив числею. Поменять местами найибольший и наименьший элемент
 */
public class Main8 {

    public static void main(String[] args) {
        int[] array = {-2, 6, 2, 9, 1};;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flipMinMax(array)));
    }

    public static int[] flipMinMax(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int maxIndex = 0;
            // define indexes of min and max elements
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            // flip min and max elements
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}