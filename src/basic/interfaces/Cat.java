package basic.interfaces;

/**
 * @description: TODO
 * Created by hqweay on 19-4-29 上午10:33
 */
public class Cat implements Pet {
  @Override
  public void run() {
    System.out.println(age);
  }

  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.run();
  }
}
