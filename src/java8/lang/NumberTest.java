package java8.lang;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/12/20 4:21 PM
 */
public class NumberTest {

  {
    System.out.println("可以语句块吗？");
  }
  

  public static void main(String[] args) {

    BigInteger integer = new BigInteger("5777777777777777777777777777777777777777777777777777755");
    BigInteger integer1 = integer.add(new BigInteger("33"));
    System.out.println(integer1);

    Double d = new Double(336.336);
    Float f;
    Integer i;
    Character c;
    Byte b;
    Long l;
    Boolean bool;

    Scanner scanner = new Scanner(System.in, "UTF-8");

    System.out.println(d);

    double scc = 3.225D;
    System.out.println((int) scc);

    {
      System.out.println("语句块吗？");

      new NumberTest();
    }
  }
}
