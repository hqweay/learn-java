package algorithm.sort;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/19/20 11:57 PM
 */
public class 冒泡排序 {
  public static void main(String[] args) {

    int[] arr = new int[]{6, 8, 2, 3, 9, 7, 5, 25, 10, 0, 0, 1, 1, 4, 4, 8};

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
