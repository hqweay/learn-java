package java8.annotation;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 12:33 PM
 */
public class TestStudentAnnotation {
  public static void main(String[] args) {
    Student student = StudentInfUtil.getStudent(Student.class);
    System.out.println(student.getName());
  }
}
