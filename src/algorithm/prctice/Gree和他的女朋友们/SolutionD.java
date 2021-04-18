package algorithm.prctice.Gree和他的女朋友们;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/3/20 12:17 AM
 */
public class SolutionD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    ArrayList<Integer> arrA = new ArrayList(N);
    ArrayList<Integer> arrB = new ArrayList<>(M);

    for (int i = 0; i < N; i++) {
      arrA.add(scanner.nextInt());
    }
    for (int i = 0; i < M; i++) {
      arrB.add(scanner.nextInt());
    }

    for (int i = 0; i < M; i++) {
      HashSet<Integer> set = new HashSet<>(arrA.subList(arrB.get(i) - 1, arrA.size()));
      System.out.println(set.size());
    }
  }


}
