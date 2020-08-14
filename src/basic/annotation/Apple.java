package basic.annotation;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:37
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
