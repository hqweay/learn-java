package basic;

//import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/26 下午3:32
 */
public class Solution {

  public static void main(String[] args) {
    new Solution().scannerTest();
  }

  public void scannerTest() {

    System.out.println(13&6);
    Scanner scanner = new Scanner(System.in);

    // while (scanner.hasNext()) {
    //   int n = scanner.nextInt();
    //   int m = scanner.nextInt();
    //   System.out.println("-======-");
    //   System.out.println(n);
    //   System.out.println(m);
    // }
    Queue ss = new PriorityQueue();
    Throwable e = new Exception("s ");
    System.out.println(e.getMessage());
    super.toString();

  }

  public void inputTest() {
    BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
    String c;

    try {
      do {
        c = (String) bufferedReader.readLine();
        System.out.println(c);
      } while (c != "q");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
