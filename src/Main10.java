/**
 * Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L.
 */
public class Main10 {

    public static void main(String[] args) {
        int[] array = {2, 100, 13, -1, 7, 9, 11};
        printIfHasRemainder(array, 2, 1);
    }

    public static void printIfHasRemainder(int[] array, int divider, int remainder) {
        if (remainder < 0 || remainder >= divider) {
            System.out.println("Wrong pair of divider and remainder");
            return;
        }
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] % divider == remainder ? array[i] + " " : "");
            }
        }
    }
}