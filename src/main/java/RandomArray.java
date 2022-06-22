import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;
import java.util.Random;

public class Array {
 int size;

 public Array(int size) {
  this.size = size;
 }


 public  int[] getRandomArray(int size) {

  int[] array = new int[size];
  for (int i = 0; i < array.length; i++) {
   array[i] = (int) Math.round((Math.random() * (200 + 1) - 100));
  }
  System.out.println(Arrays.toString(array));
  return array;
 }
}


