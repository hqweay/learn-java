package basic.proxy;

import java.lang.reflect.Proxy;

/**
 * @description: TODO
 * Created by hqweay on 19-4-29 上午11:33
 */
public class MyDynamicProxy {
  public static void main(String[] args) {
    Cat cat = new Cat();
    MyInvocationHandler myInvocationHandler = new MyInvocationHandler(cat);
    Pet pet = (Pet) Proxy.newProxyInstance(Cat.class.getClassLoader(), Cat.class.getInterfaces(),
            myInvocationHandler);
    pet.run();
  }
}
