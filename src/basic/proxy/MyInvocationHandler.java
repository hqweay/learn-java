package basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO
 * Created by hqweay on 19-4-29 上午11:31
 */
public class MyInvocationHandler implements InvocationHandler {
  private Object target;
  public MyInvocationHandler(Object target) {
    this.target = target;
  }
  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    System.out.println("跑前");
    method.invoke(target);
    System.out.println("跑后");
    return null;
  }
}
