package basic.ioTest.ioOne;

import java.io.*;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/19/20 11:32 PM
 */
public class IOTestA {
  public static void main(String[] args) {
    InputStreamReader inputStreamReader = null;
    OutputStreamWriter outputStreamWriter = null;
    try {
      inputStreamReader = new InputStreamReader(new FileInputStream("src/basic/ioTest/ioOne/a.txt"), "UTF-8");

      outputStreamWriter = new OutputStreamWriter(new FileOutputStream("src/basic/ioTest/ioOne/b.txt"), "UTF-8");

      char[] chars = new char[1024];
      while (inputStreamReader.read(chars) != -1) {
        System.out.println(chars);
        outputStreamWriter.write(chars);
      }


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        inputStreamReader.close();
        outputStreamWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }

    }
  }
}
