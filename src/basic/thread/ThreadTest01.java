package basic.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: TODO
 * Created by hqweay on 19-2-22 上午11:55
 */
public class ThreadTest01 implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    return 114;
  }

  public static void main(String[] args) {
    ThreadTest01 threadTest01 = new ThreadTest01();
    FutureTask<Integer> futureTask = new FutureTask<>(threadTest01);
    Thread thread = new Thread(futureTask);
    thread.start();
    try {
      System.out.println(futureTask.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
