package basic.serializable;

import java.io.Serializable;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:06
 */
public class Person implements Serializable {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
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
}
