package ssss;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 4:33 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }
    int M = scanner.nextInt();
    int[] keys = new int[M];
    for (int i = 0; i < M; i++) {
      keys[i] = scanner.nextInt();
    }

    for (int i = 0; i < M; i++) {
      int key = keys[i];
      int count = 0;
      for (int j = 0; j < N; j++) {
        count += arr[j];
        if (key >= count - arr[j] && key <= count) {
          System.out.println(j + 1);
          break;
        }
      }
    }

  }
}
