package java8.annotation;

import java.lang.reflect.Field;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/22/20 10:30 AM
 */
public class FruitInfoUtil {
  public static void getFruitInfo(Class<?> clazz) {
    String strFruitName = " 水果名称：";

    //获取属性值
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (field.isAnnotationPresent(FruitName.class)) {
        //判断注解是不是 FruitName
        FruitName fruitName = field.getAnnotation(FruitName.class);
        strFruitName = strFruitName + fruitName.fruitName();
        System.out.println(strFruitName);
      }
    }
  }

  public static Apple getApple(Class<?> clazz) {
    String strFruitName = " 水果名称：";

    //获取属性值
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      if (field.isAnnotationPresent(FruitName.class)) {
        //判断注解是不是 FruitName
        FruitName fruitName = field.getAnnotation(FruitName.class);
        strFruitName = strFruitName + fruitName.fruitName();
        System.out.println(strFruitName);
        Apple apple = new Apple();
        apple.setAppleName(strFruitName);
        return apple;
      }
    }
    return null;
  }
}
