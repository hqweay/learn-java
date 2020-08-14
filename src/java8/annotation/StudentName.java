package java8.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 12:27 PM
 */
@Target(FIELD) //ElementType.FIELD:成员变量、对象、属性（包括enum实例）
@Retention(RUNTIME)// 始终不会丢弃，运行期也保留该注解，因此可以使用反射机制读取该注解的信息。
public @interface StudentName {
  public String StudentName() default "小明";
}
