package algorithm.prctic.数学题;


import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 2:20 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int M = scanner.nextInt();
    int[] arr = new int[N];
    int[] temp = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
      temp[i] = -1;
    }


    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (Math.abs(arr[i] - arr[j]) == M) {
          temp[i] = 1;
          temp[j] = 1;
        }
      }
    }
    int count = 0;
    int result[] = new int[K];
    for (int i = 0; i < N; i++) {
      if (temp[i] == 1) {
        result[count++] = arr[i];
      }
      if (count == K) {
        break;
      }
    }
    if (count == K) {
      System.out.println("YES");
      for (int i = 0; i < K; i++) {
        System.out.println(result[i]);
      }
    } else {
      System.out.println("NO");
    }

  }
}
