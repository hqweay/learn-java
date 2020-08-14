package basic.ioTest;

import java.io.File;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午3:38
 */
public class TestFile {
  public static void main(String[] args) {
    File file = new File("src/testIO/test.txt");
    System.out.println(file.getName());
//    System.out.println("delete" + file.delete());
  }
}
