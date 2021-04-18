package algorithm.prctice.Gree和他的女朋友们;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/3/20 12:25 AM
 */
public class SolutionE {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] arrA = new int[N];
    int[] arrB = new int[M];


    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextInt();
    }
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }

    for (int i = 0; i < M; i++) {

      int index = arrB[i];
      int count = 0;
      // int[] tempArr = Arrays.copyOfRange(arrA, index - 1, arrA.length);

      int[] tempArr = new int[N - index + 1];
      for (int j = 0; j < tempArr.length; j++) {
        tempArr[j] = arrA[index - 1 + j];
      }

      for (int j = 0; j < tempArr.length; j++) {
        for (int k = j + 1; k < tempArr.length; k++) {
          if (tempArr[j] != -2 && tempArr[j] == tempArr[k]) {
            tempArr[k] = -2;
          }
        }
        if (tempArr[j] != -2) {
          count++;
        }
      }

      System.out.println(count);
    }
  }
}
