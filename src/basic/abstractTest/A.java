package basic.abstractTest;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/20/20 9:51 PM
 */
class A {
  A() {
    test();
  }

  void test() {
    System.out.println("A");
  }
}

class B extends A {
  B() {
    test();
  }

  @Override
  void test() {
    System.out.println("B");
  }

  public static void main(String[] args) {
    try {
      Class.forName("A");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    new B();

  }
}
