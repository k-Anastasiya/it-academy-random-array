import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println("Введите дивпазон массива");
        int numberFirst = scanner.nextInt();
        int numberSacond = scanner.nextInt();

        RandomArray randomArray = new RandomArray(size, numberFirst, numberSacond);
        System.out.println(Arrays.toString(randomArray.createRandomArray(size, numberFirst, numberSacond)));
        System.out.println(randomArray.setRandomArray(randomArray.createRandomArray(size, numberFirst, numberSacond)));
    }
}