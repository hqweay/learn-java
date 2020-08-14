package basic.ioTest.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO
 * Created by hqweay on 19-4-17 上午10:36
 */
public class A {

  public static void main(String[] args) {
    try {
      FileChannel channel = new RandomAccessFile("./src/a.txt", "rw").getChannel();

      ByteBuffer buffer = ByteBuffer.allocate(48);

      int bytesRead = channel.read(buffer);

      System.out.println(bytesRead);


    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
