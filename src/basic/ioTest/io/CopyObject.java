package basic.ioTest.io;

import java.io.*;

/**
 * @description: TODO
 * Created by hqweay on 19-5-13 下午8:16
 */
public class CopyObject {
  public static void main(String[] args) {
    try {

      FileReader a = new FileReader("./src/io/a.txt");
      FileWriter b = new FileWriter("./src/io/C.txt");

      FileInputStream in = new FileInputStream("./src/io/a.txt");
      FileOutputStream out = new FileOutputStream("./src/io/C.txt");

      byte[] bs = new byte[1024];

      int leng = 0;


//      while((leng = in.read(bs)) > 0){
//        out.write(bs, 0, leng);
//
//      }

      BufferedReader bufferedReader = new BufferedReader(a);
      BufferedWriter bufferedWriter = new BufferedWriter(b);

      String ss;
      while((ss=bufferedReader.readLine()) != null){
        bufferedWriter.write(ss);
        System.out.println(ss);
      }

      in.close();
      out.close();
      // 记得关闭
      bufferedWriter.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {

    }

  }
}
