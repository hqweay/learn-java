package basic.thread.threadA;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: TODO
 * Created by hqweay on 19-4-27 下午8:22
 */
public class Notify {

  public static int ss = 0;
  public static ReentrantLock lock = new ReentrantLock();


  public static void main(String[] args) {

//    ReentrantLock lock = new ReentrantLock();

    Thread one = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int j = 0;j < 10000; j++){
          lock.lock();

          try{
            ss++;

          }finally {
            lock.unlock();
          }

        }
      }
    });
    Thread two = new Thread(new Runnable() {
      @Override
      public void run() {
//        System.out.println("two start");
        for(int j = 0;j < 10000; j++){
          lock.lock();
          try{
            ss++;

          }finally {
            lock.unlock();
          }
        }
      }
    });
    one.start();
    two.start();

    System.out.println(ss);

  }

}
