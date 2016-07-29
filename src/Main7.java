/**
 * Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Main7 {

    public static void main(String[] args) {
        int[] array = {-2, 6, 2, 0, -1, 0, 8, 9, 0};
        countElements(array);
    }

    public static void countElements(int[] array) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("Positive : %d\nNegative : %d\nZeroes : %d", positive, negative, zero);
    }
}