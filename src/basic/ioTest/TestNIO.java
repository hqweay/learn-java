package basic.ioTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/14 下午3:55
 */
public class TestNIO {


  public void testNIO() throws IOException {
    FileChannel in = new RandomAccessFile("./src/testIO/test.txt", "rw").getChannel();
    ByteBuffer buffer = ByteBuffer.allocate(42);

    while (in.read(buffer) != -1) {
      buffer.flip();
      System.out.print(Charset.forName("utf-8").decode(buffer));
      buffer.clear();
    }
  }
}
