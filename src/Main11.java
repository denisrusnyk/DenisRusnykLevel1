import java.util.Arrays;

/**
 *Дан массив чисел.  Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
 */
public class Main11 {

    public static void main(String[] args) {
        Object[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(flipOddEvenIndexes(array)));
    }

    public static Object[] flipOddEvenIndexes(Object[] array) {
        Object temp;
        for (int i = 1; i < array.length; i = i + 2) {
            temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}