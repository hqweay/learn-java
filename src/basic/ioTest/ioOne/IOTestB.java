package basic.ioTest.ioOne;

import java.io.*;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/19/20 11:44 PM
 */
public class IOTestB {
  public static void main(String[] args) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader("src/basic/ioTest/ioOne/a.txt"));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/basic/ioTest/ioOne/b.txt"));

      String str = "";
      while ((str = bufferedReader.readLine()) != null) {
        System.out.println(str);
        bufferedWriter.write(str);
        bufferedWriter.newLine();
      }

      bufferedWriter.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
