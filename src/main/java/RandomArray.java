import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int numberPositve = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round((Math.random() * (200 + 1) - 100));
        }


        for (int number : array) {
            if (number % 2 != 0 && number > 0) {
                numberPositve++;

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Kоличество положительных нечетных чисел в этом массиве " + numberPositve);

    }
}