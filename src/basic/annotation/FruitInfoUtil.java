package basic.annotation;

import java.lang.reflect.Field;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:36
 */
public class FruitInfoUtil {
  public static void getFruitInfo(Class<?> clazz){
    String strFruitName=" 水果名称：";

    //获取属性值
    Field[] fields=clazz.getDeclaredFields();
    for(Field field:fields){
      if(field.isAnnotationPresent(FruitName.class)){
        //判断注解是不是 FruitName
        FruitName fruitName=field.getAnnotation(FruitName.class);
        strFruitName=strFruitName+fruitName.fruitName();
        System.out.println(strFruitName);
      }
    }
  }

  public static Apple getApple(Class<?> clazz){
    String strFruitName=" 水果名称：";

    //获取属性值
    Field[] fields=clazz.getDeclaredFields();
    for(Field field:fields){
      if(field.isAnnotationPresent(FruitName.class)){
        //判断注解是不是 FruitName
        FruitName fruitName=field.getAnnotation(FruitName.class);
        strFruitName=strFruitName+fruitName.fruitName();
        System.out.println(strFruitName);
        Apple apple = new Apple();
        apple.setAppleName(strFruitName);
        return apple;
      }
    }
    return null;
  }
}
