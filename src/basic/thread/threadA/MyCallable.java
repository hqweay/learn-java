package basic.thread.threadA;

import java.util.concurrent.Callable;

/**
 * @description: TODO
 * Created by hqweay on 19-4-30 上午11:14
 */
public class MyCallable implements Callable<String> {
  @Override
  public String call() throws Exception {
    String s = "hello babe";
    System.out.println("ready to work");
    Thread.currentThread().sleep(1000);
    return s;
  }
}
