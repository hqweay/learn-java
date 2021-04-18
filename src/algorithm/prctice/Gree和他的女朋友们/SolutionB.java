package algorithm.prctice.Gree和他的女朋友们;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/31/20 10:40 PM
 */
public class SolutionB {
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
      int times = 0;
      int[] temp = Arrays.copyOfRange(arrA, index - 1, arrA.length);
      Arrays.sort(temp);
      

      for (int j = 0; j < temp.length; ) {
        int dex = j;
        for (int k = j + 1; k < temp.length; k++) {
          if (temp[j] == temp[k]) {
            dex++;
          } else {
            break;
          }
        }
        times++;
        j = dex + 1;
      }


      System.out.println(times);
    }

  }


}
