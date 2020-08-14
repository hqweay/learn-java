package java8.annotation;

import java.lang.reflect.Field;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 12:28 PM
 */
public class StudentInfUtil {
  public static Student getStudent(Class<?> clazz) {
    //获取属性值
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (field.isAnnotationPresent(StudentName.class)) {
        //判断注解是不是 FruitName
        StudentName studentName = field.getAnnotation(StudentName.class);
        Student student = new Student();
        student.setName(studentName.StudentName());
        return student;
      }
    }
    return null;
  }
}
