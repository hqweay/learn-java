package basic.ioTest;

import jdk.internal.util.xml.impl.Input;
import org.junit.Test;

import java.io.*;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午3:42
 */
public class TestMain {

  @Test
  public void testOutputStream() throws IOException {
    InputStream fos = new FileInputStream("src/testIO/test.txt");
    byte[] bys = new byte[1024];
    int len = 0;
    while((len = fos.read(bys)) != -1){
      System.out.print(new String(bys, 0, len));
    }
    fos.close();
  }

  @Test
  public void testInputStreamReader() throws IOException {
    InputStreamReader ins = new InputStreamReader(new FileInputStream("src/testIO/test.txt"),
            "utf-8");
    char[] crs = new char[1024];
    int len = 0;
    while((len = ins.read(crs)) != -1){
      System.out.print(new String(crs, 0, len));
    }
    ins.close();
  }
}
