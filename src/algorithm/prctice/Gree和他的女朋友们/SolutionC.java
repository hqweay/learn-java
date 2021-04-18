package algorithm.prctice.Gree和他的女朋友们;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/2/20 11:54 PM
 */
public class SolutionC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] arrA = new int[N];
    int[] arrB = new int[M];

// cache
    int[] arrTemp = new int[N];

    // n day
    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextInt();
      arrTemp[i] = -2;
    }
    // asked m times
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }


    for (int i = 0; i < M; i++) {
      setEmpty(arrTemp, N);
      int start = arrB[i];
      for (int j = start - 1; j < N; j++) {
        if (hasMe(arrTemp, N, arrA[j])) {
          continue;
        } else {
          arrTemp[j] = arrA[j];
        }
      }
      System.out.println(getTempCount(arrTemp, N));
    }
  }

  public static int getTempCount(int[] arrTemp, int N) {
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (arrTemp[i] != -2) {
        count++;
      }
    }
    return count;
  }

  public static void setEmpty(int[] arrTemp, int N) {
    for (int i = 0; i < N; i++) {
      arrTemp[i] = -2;
    }
  }


  public static boolean hasMe(int[] arrTemp, int N, int key) {
    for (int i = 0; i < N; i++) {
      if (arrTemp[i] == key) {
        return true;
      }
    }
    return false;
  }
}
