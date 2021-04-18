package ss;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 3:22 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    String str = scanner.nextLine();
    str = scanner.nextLine();
    char[] ss = str.toCharArray();
    for (int i = 0; i < N; i++) {
      if (i < N - 1 && ss[i] != 'Q' && ss[i] == ss[i + 1]) {
        ss[i] = 'Q';
      } else if (i == N - 1) {
        for (int j = 0; j < N; j++) {
          if (ss[j] == 'Q') {
            continue;
          } else {
            if (i == j) {
              break;
            } else if (ss[i] == ss[j]) {
              ss[i] = 'Q';
            }
          }
        }
      }
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      if (ss[i] == 'Q') {
        count++;
      }
    }
    System.out.println(count);
  }
}
