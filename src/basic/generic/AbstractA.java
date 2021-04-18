package basic.generic;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/19/20 10:48 PM
 */
public abstract class AbstractA {
  int temp = 50;

  public abstract void test();

  public static void main(String[] args) {
    AbstractA a = new AbstractA() {
      @Override
      public void test() {
        System.out.println("aa");
      }
    };

    a.test();
  }
}
