import java.util.Arrays;

/**
 * Дан массив чисел. Создать массив из четных чисел этого массива.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class Main5 {

    public static void main(String[] args) {
        int[] array = {3, 4, 8, 22, 10, 1};
        System.out.println(Arrays.toString(arrayOfEvens(array)));
        System.out.println(Arrays.toString(funcArrayOfEvens(array)));
    }

    public static int[] funcArrayOfEvens(int[] array) {
        int[] result = Arrays.stream(array).filter(n -> (n % 2) == 0).toArray();
        if (result.length == 0) {
            System.out.println("There is not even numbers");
        }
        return result;
    }

    public static int[] arrayOfEvens(int[] array) {

        // calculate length of result array
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }

        // create empty result array
        int[] result = new int[evenCounter];

        // fill result array with even numbers of the given array
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j++] = array[i];
            }
        }

        if (result.length == 0) {
            System.out.println("There is not even numbers");
        }

        return result;
    }

}