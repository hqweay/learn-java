package algorithm.prctice.给花园浇水;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/24/20 7:46 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    for (int i = 0; i < T; i++) {
      int N = scanner.nextInt();
      int K = scanner.nextInt();
      int[] arr = new int[K];
      for (int j = 0; j < K; j++) {
        arr[j] = scanner.nextInt();
      }
      System.out.println(getResult(N, K, arr));
    }

  }

  public static int getResult(int N, int K, int[] arr) {
    int left = 0;
    int right = 0;
    int max = 0;
    if (K <= 0) {
      return 0;
    }

    left = arr[0];
    right = N - arr[K - 1] + 1;
    max = left >= right ? left : right;

    if (K == 1) {
      return max;
    }

    for (int i = 0; i < K - 1; i++) {
      if (max < (arr[i + 1] - arr[i]) / 2 + 1) {
        max = (arr[i + 1] - arr[i]) / 2 + 1;
      }
    }
    return max;
  }
}
