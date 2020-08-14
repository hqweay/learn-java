package basic.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: TODO
 * Created by hqweay on 19-4-28 上午10:48
 */
public class TCPServer {
  public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(65000);

    while (true){
      Socket socket = ss.accept();
      new LengthCalculator(socket).start();
    }
  }
}
