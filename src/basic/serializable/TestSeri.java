package basic.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:07
 */
public class TestSeri {
  public static void main(String[] args) {
    try{
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/testSerializable/person.txt"));
      Person xiaomk = new Person("xiaomk", 55);
      oos.writeObject(xiaomk);


      ObjectInputStream inn = new ObjectInputStream(new FileInputStream("src/testSerializable/person.txt"));
      Person ss = (Person) inn.readObject();

      System.out.println(ss.getName());

    }catch (Exception e){

    }
  }
}
