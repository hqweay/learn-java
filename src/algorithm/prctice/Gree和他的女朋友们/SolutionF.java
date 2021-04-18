package algorithm.prctice.Gree和他的女朋友们;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/3/20 12:25 AM
 */
public class SolutionF {
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

    // for (int i = 0; i < M; i++) {
    //   for (int j = i + 1; j < M; j++) {
    //     if (arrA[i] > 0 && arrA[i] == arrA[j]) {
    //       arrA[j] = -arrA[j];
    //     }
    //   }
    // }

    for (int i = 0; i < M; i++) {

      int index = arrB[i] - 1;
      int count = 0;


      for (int j = index; j < N; j++) {
        for (int k = j + 1; k < N; k++) {
          if (arrA[j] > 0 && arrA[j] == arrA[k]) {
            arrA[k] = -arrA[k];
          }
        }
        if (arrA[j] > 0) {
          count++;
        }
      }

      for (int j = 0; j < N; j++) {
        arrA[j] = arrA[j] < 0 ? -arrA[j] : arrA[j]; //Math.abs(arrA[j]);
      }

      System.out.println(count);
    }
  }
}
