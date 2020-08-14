package basic.ioTest.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description: TODO
 * Created by hqweay on 19-5-13 下午8:43
 */
public class Channel {
  public static void main(String[] args) {
    try {
      FileChannel channel = new RandomAccessFile("./src/io/a.txt", "rw").getChannel();


      // 缓冲区分配为 文件大小
      // 否则多输出一些乱码内容哦
      int fileLen = (int) channel.size();
      ByteBuffer buffer = ByteBuffer.allocate(fileLen);

      // 4. 读取到缓冲区
      channel.read(buffer);
      // 5. 反转缓冲区，准备读取数据
      Buffer bf = buffer.flip();
      // 6. 获取到数组
      byte[] bt = (byte[]) bf.array();
      System.out.println(new String(bt));
      channel.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
