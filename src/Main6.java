import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * Дан массив чисел. Заменить все его элементы, большие данного числа Z, этим числом. Подсчитать количество замен.
 */
public class Main6 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 15, -10, 0};
        System.out.println(Arrays.toString(funcElementsReplacements(array1, 10)));
        int[] array2 = {1, 2, 4, 15, -10, 0};
        System.out.println(Arrays.toString(elementReplacement(array2, 10)));
    }

    public static int[] funcElementsReplacements(int[] array, int element) {
        final long[] counter = {0};

        IntUnaryOperator operator = operand -> {
            if (operand > element) {
                counter[0]++;
                return element;
            } else {
                return operand;
            }
        };

        int[] result =  Arrays.stream(array)
                .map(operator)
                .toArray();
        System.out.println("Replacements: " + counter[0]);
        return result;
    }

    public static int[] elementReplacement(int[] array, int element) {
        long counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > element) {
                array[i] = element;
                counter++;
            }
        }
        System.out.println("Replacements: " + counter);
        return array;
    }

}