package basic.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: TODO
 * Created by hqweay on 19-5-21 下午3:59
 */
public class Exec {
  public static void main(String[] args) {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 3,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(3),
            new ThreadPoolExecutor.DiscardOldestPolicy());

    threadPoolExecutor.execute(new Runnable() {
      @Override
      public void run() {
        System.out.println("fff");
      }
    });

    threadPoolExecutor.submit(new Runnable() {
      @Override
      public void run() {
        System.out.println("laozi");
      }
    });

  }
}
