/**
 * Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа, включительно до нуля.
 */
public class Main12 {

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 2, 1};
        printSequence(array);
    }

    public static void printSequence(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i++] + " ");
        }
        while (array[i - 1] != 0);
    }
}