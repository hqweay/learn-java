package java8.annotation;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 12:26 PM
 */
public class Student {
  @StudentName(StudentName = "小王")
  private String name;

  public Student() {
  }

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
