package 凑桌子;

import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 2:45 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }

    int count = 0;

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 1 && arr[j] == 2) || (arr[i] == 2 && arr[j] == 1)) {
          arr[i] = 0;
          arr[j] = 3;
          count++;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 2 && arr[j] == 4) || (arr[i] == 4 && arr[j] == 2)) {
          arr[i] = 3;
          arr[j] = 3;
          count++;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 1 && arr[j] == 3) || (arr[i] == 3 && arr[j] == 1)) {
          arr[i] = 4;
          arr[j] = 0;
          count++;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 2 && arr[j] == 2)) {
          arr[i] = 4;
          arr[j] = 0;
          count++;
          count++;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 1 && arr[j] == 1)) {
          arr[i] = 2;
          arr[j] = 0;
          count++;
        }
      }
    }
    //2 2
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 2 && arr[j] == 2)) {
          arr[i] = 4;
          arr[j] = 0;
          count++;
          // count++;
        }
      }
    }
    //  1 2
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 1 && arr[j] == 2) || (arr[i] == 2 && arr[j] == 1)) {
          arr[i] = 0;
          arr[j] = 3;
          count++;
        }
      }
    }

    //4 2
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if ((arr[i] == 4 && arr[j] == 2) || (arr[i] == 2 && arr[j] == 4)) {
          arr[i] = 3;
          arr[j] = 3;
          count++;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      if (arr[i] == 1 || arr[i] == 2) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println(count);


  }
}
