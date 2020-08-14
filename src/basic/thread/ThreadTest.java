package basic.thread;

/**
 * @description: TODO
 * Created by hqweay on 19-2-22 上午11:53
 */
public class ThreadTest implements Runnable{
  @Override
  public void run() {
    System.out.println("hello");
  }

  public static void main(String[] args) {
    ThreadTest threadTest = new ThreadTest();
    Thread thread = new Thread(threadTest);
    thread.start();

    new Runnable() {
      @Override
      public void run() {
        System.out.println("sssssss");
      }
    }.run();
  }
}
