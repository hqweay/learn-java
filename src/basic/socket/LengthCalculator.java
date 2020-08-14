package basic.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @description: TODO
 * Created by hqweay on 19-4-28 上午10:49
 */
public class LengthCalculator extends Thread{
  private Socket socket = null;
  public LengthCalculator(Socket socket){
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
      OutputStream os = socket.getOutputStream();
      InputStream is = socket.getInputStream();

      int ch = 0;
      byte[] buff = new byte[1024];
      ch = is.read(buff);

      String content = new String(buff, 0, ch);

      System.out.println(content);
      os.write(String.valueOf(content.length()).getBytes());
      is.close();
      os.close();
      socket.close();


    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
