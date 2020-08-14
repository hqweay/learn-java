package basic.thread.threadA;

/**
 * @description: TODO
 * Created by hqweay on 19-5-6 上午9:03
 */
public class ThreadWaitDemo {


  public static void main(String[] args) {
    final Object lock = new Object();
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {

        System.out.println("Thread A try to get lock.");
        synchronized (lock){

          try {
            Thread.sleep(100);
            System.out.println("Thread A try to sleep");
            lock.wait(200);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });
    thread.start();
  }
}
