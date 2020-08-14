package basic.ioTest;

import java.io.File;

/**
 * @description: TODO
 * Created by hqweay on 19-2-22 上午10:51
 */
public class IO {

  public static void main(String[] args) {
    IO io = new IO();
    File dir = new File("/home/hqweay/Desktop");
    io.listAllFiles(dir);
  }

  public void listAllFiles(File dir){

    if(dir == null || !dir.exists()){
      return ;
    }
    if(dir.isFile()){
      System.out.println(dir.getName());
      return;
    }

    for(File file : dir.listFiles()){
      listAllFiles(file);
    }
  }
}
