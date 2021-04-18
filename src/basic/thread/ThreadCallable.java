package basic.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/7 下午1:28
 */
public class ThreadCallable implements Callable<Integer> {
  @Override
  public Integer call() throws Exception {
    return 55;
  }

  public static void main(String[] args) {
    ThreadCallable my = new ThreadCallable();

    FutureTask<Integer> task = new FutureTask<>(my);
    Thread thread = new Thread(task);
    thread.start();
    // PreparedStatement

    try {
      System.out.println(task.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
  }
}
