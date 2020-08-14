package basic.collections;

import java.util.Objects;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/14 下午3:39
 */
public class TestC {
  private int age;
  private String name;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TestC)) return false;
    TestC testC = (TestC) o;
    return getAge() == testC.getAge() &&
            Objects.equals(getName(), testC.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAge(), getName());
  }

  public TestC(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
