//package masha的糖果;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 2:02 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[4];
    for (int i = 0; i < 4; i++) {
      arr[i] = scanner.nextInt();
    }
    if (arr[0] + arr[1] == arr[2] + arr[3]) {
      System.out.println("YES");
      return;
    }
    if (arr[0] + arr[2] == arr[1] + arr[3]) {
      System.out.println("YES");
//      new StringBuffer().a
      return;
    }
    if (arr[0] + arr[3] == arr[1] + arr[2]) {
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }
}
