package basic.arrays;

import java.util.Arrays;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:49
 */
public class TestArray {
  public static void main(String[] args) {
    int[] arr = new int[]{9,1,2,8,3,5,7,4,6,};

    Arrays.sort(arr);
    int key = Arrays.binarySearch(arr,6);
    System.out.println(key);

    Arrays.fill(arr, 6);

    Arrays.stream(arr).forEach(System.out::println);

    // System.out.println(Arrays.binarySearch(new int[]{1,2,2,3,3,4,5,6,6,7,8}, 5));

  }
}
