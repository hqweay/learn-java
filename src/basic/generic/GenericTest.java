package basic.generic;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/14 下午3:48
 */
public class GenericTest<T> {
  T name;

  public T getName() {
    return name;
  }

  public <E> void setName(E name) {
    // S name;
    // this.name = name;
  }

  public static void main(String[] args) {
    GenericTest genericTest = new GenericTest();
    genericTest.setName("ss");
    System.out.println(genericTest.getName());
  }
}
