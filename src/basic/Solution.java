package basic;

//import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/26 下午3:32
 */
public class Solution {

  public static void main(String[] args) {
    new Solution().inputTest();
  }

  public void scannerTest() {
    Scanner scanner = new Scanner(System.in);

    while(scanner.hasNext()){
      int n = scanner.nextInt();
      System.out.println(n);
    }

  }

  public void inputTest()  {
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
