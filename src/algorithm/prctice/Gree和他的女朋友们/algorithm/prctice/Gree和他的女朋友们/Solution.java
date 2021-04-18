package algorithm.prctice.Gree和他的女朋友们;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/31/20 10:40 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] arrA = new int[N];
    int[] arrB = new int[M];
    int[] result = new int[N];

    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextInt();
    }
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }

    HashSet<Integer> set = new HashSet<>();

    for(int i = N-1; i >= 0; i--){
      set.add(arrA[i]);
      result[i] = set.size();
    }

    for (int i = 0; i < M; i++){
      System.out.println(result[arrB[i] - 1]);
    }
  }
}
