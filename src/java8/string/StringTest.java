package java8.string;

import java.io.*;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/1/20 10:42 AM
 */
public class StringTest {
  // protected ;
  public static void main(String[] args) {

    new StringTest().testTwo();
  }

  public void testTwo() {
    String str = "oneAndTwoandthree";
    String strone = "oneAndTwoandthree";

    System.out.println(str == strone);

    System.out.println(str.hashCode());
    System.out.println(strone.hashCode());
  }

  public void testOne() {
    String str = "但a是b啊c我d说e";

    System.out.print(str.toCharArray());

    int num = (int) 6000000000L;
    System.out.println(num);

    int[] arr = new int[5];
    arr[0] = 50;
    System.out.println(arr[0]);

    Scanner scanner = new Scanner(System.in);
    scanner.next();

    StringBuffer ss = new StringBuffer("We Are No One.");
    ss.replace(2, 3, "ss");

    try {
      DataInputStream dataInputStreameam = new DataInputStream(
              new BufferedInputStream(
                      new FileInputStream("1.txt")));
      int strTest = dataInputStreameam.read();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
