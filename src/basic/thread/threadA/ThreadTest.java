package basic.thread.threadA;

import java.util.concurrent.TimeUnit;

public class ThreadTest {

  static class Demino implements Runnable{
    private Thread thread;
    public Demino(Thread thread){
      this.thread = thread;
    }
    public Demino(){}
    @Override
    public void run() {
      try{
        System.out.println(System.currentTimeMillis());
        thread.join(5);
        System.out.println(System.currentTimeMillis());
      }catch (InterruptedException e){

      }
      System.out.println(Thread.currentThread().getName() + "ssss");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread previous = Thread.currentThread();
    for(int i = 0; i < 10; i++){
      Thread thread = new Thread(new Demino(previous), String.valueOf(i));
      thread.start();
      previous = thread;
    }
    TimeUnit.SECONDS.sleep(5);
    System.out.println(Thread.currentThread().getName() + "main");
  }
}