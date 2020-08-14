package basic.thread.threadA;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: TODO
 * Created by hqweay on 19-4-30 上午11:16
 */
public class FutureTaskDemo {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    FutureTask<String> task  = new FutureTask<String>(new MyCallable());
    new Thread(task).start();
    String s = task.get();
    System.out.println(s);


  }
}
