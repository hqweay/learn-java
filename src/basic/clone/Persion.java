package basic.clone;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:15
 */
public class Persion implements Cloneable{
  private String name;
  private int age;
  private int[] arr;


  public int getArr(int index) {
    return arr[index];
  }

  public void setArr(int index, int value) {
    this.arr[index] = value;
  }

  public Persion(String name, int age) {
    this.name = name;
    this.age = age;
    arr = new int[10];
    for(int i = 0; i < 10; i++){
      arr[i] = i;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
