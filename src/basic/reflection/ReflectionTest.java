package basic.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description: TODO
 * Created by hqweay on 19-4-12 下午3:52
 */
public class ReflectionTest {

  public void SS(){
    System.out.println("ssssssssss");
  }

  public void SS(String a){
    System.out.println(a);
  }

  public void TT(String ...args){
    for(String a: args){
      System.out.println(a);
    }
  }

  private int temp = 10;

  public static void main(String[] args) throws Exception {



    Class cls = Class.forName("reflection.backup");

    ReflectionTest o = (ReflectionTest)cls.newInstance();
    o.SS();

    Method m = cls.getDeclaredMethod("SS");
    m.invoke(o);

    Method mt = cls.getDeclaredMethod("SS",String.class);
    mt.invoke(o, "aaaaaaa");

    Field ll = cls.getDeclaredField("temp");
    System.out.println(ll);

    o.TT("aaa","bbb","ccc");



  }
}
