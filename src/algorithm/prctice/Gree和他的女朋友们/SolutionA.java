package algorithm.prctice.Gree和他的女朋友们;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/31/20 11:25 PM
 */
public class SolutionA {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    long[] arrA = new long[N];
    int[] arrB = new int[M];

    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextLong();
    }
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }

    HashMap<Long, Integer> map = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int index = arrB[i];
      map.clear();


      for (int j = index - 1; j < N; j++) {
        if (map.containsKey(arrA[j])) {
          map.replace(arrA[j], map.get(arrA[j] + 1));
        } else {
          map.put(arrA[j], 1);
        }
      }

      System.out.println(map.size());
      
    }
  }
}
