package algorithm.prctice.使给定数字成为不存在于数组中的最小非负整数;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: 给定一个长度为n的数组和数字x，数组内均为非负整数，
 * 求最少要执行多少步操作可以使得不存在于该数组中的最小非负整数为x。
 * 每一步操作可以向数组中添加一个非负整数，也可以去掉一个现有的数。
 * Created on 8/18/20 5:19 PM
 */
public class Solution {

  // temp 计算多了，中间部分，不必剔除

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int X = scanner.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }

    System.out.println(Get(N, arr, X));
  }

  public static int Get(int N, int[] arr, int X) {

    Arrays.sort(arr);

    // 小于最小值，只有左边差的
    if (X < arr[0]) {
      return X;
    }

    //等于最小值 左边差的 + 重复的
    if (X == arr[0]) {
      int temp = 0;
      for (int i = 0; i < N; i++) {
        if (arr[i] == X) {
          temp++;
        }
      }

      return temp + X;

    }

    // 等于最大值 左边差的 + 重复的 + 中间差的
    if (X == arr[N - 1]) {
      int temp = 0;
      int M = 0;
      for (int j = N - 1; j >= 0; j--) {
        if (arr[j] == X) {
          temp++;
        } else if (j >= 1 && arr[j] == arr[j - 1]) {
          // temp++;
        }
        if (j >= 1 && arr[j] > arr[j - 1]) {
          M += arr[j] - arr[j - 1] - 1;
        }
      }
      int L = arr[0];
      return temp + M + L;


    }


    // 没问题 大于最大值，左边差的，重复的，中间差的，右边差的
    // if (X > arr[N - 1] ) {
    if (X > arr[N - 1]) {
      //左差的
      int A = arr[0];
      //右差的
      int B = X - arr[N - 1] - 1;
      //中间差的
      int C = 0;
      //重复的
      int tempD = 0;
      for (int i = 0; i < N - 1; i++) {
        //中间差的
        if (arr[i + 1] > arr[i]) {
          C += arr[i + 1] - arr[i] - 1;
        }
        //重复的
        if (arr[i + 1] == arr[i]) {
          // tempD++;
        }
      }
      //arr[0] 左边差的
      return A + B + C + tempD;
    }


    // 中间段
    // 左边差的
    int L = arr[0];
    //重复的
    int tempC = 0;
    //中间差的
    int M = 0;

    for (int i = 0; i < N; i++) {

      if (X == arr[i]) {
        tempC++;
      }

      if (i + 1 < N && X > arr[i] && X <= arr[i + 1]) {
        M += X - arr[i] - 1;
      }
      if (i + 1 < N && X > arr[i + 1] && arr[i + 1] == arr[i]) {
        // tempC++;
      }
      if (i + 1 < N && X > arr[i + 1] && arr[i + 1] > arr[i]) {
        M += arr[i + 1] - arr[i] - 1;
      }
    }
    return M + tempC + L;
  }
}
