package basic.ioTest.ioOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description: TODO
 * Created by hqweay on 19-4-17 上午10:36
 */
public class B {
  public static void main(String[] args) throws IOException {

    FileReader re = new FileReader("./src/a.txt");

    BufferedReader reader = new BufferedReader(re);
    String s;
    while (null != (s = reader.readLine())) {
      System.out.println(s);
    }
  }
}
