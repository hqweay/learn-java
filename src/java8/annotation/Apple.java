package java8.annotation;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 10:30 AM
 */
public class Apple {
  @FruitName(fruitName = "苹果")
  private String appleName;

  public Apple() {
    this.appleName = appleName;
  }

  public String getAppleName() {
    return appleName;
  }

  public void setAppleName(String appleName) {
    this.appleName = appleName;
  }

  public static void main(String[] args) {
//    Apple apple = new Apple();
    Apple apple = FruitInfoUtil.getApple(Apple.class);
    System.out.println("name is " + apple.getAppleName());
  }
}
