package basic.interfaces;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/18/20 4:19 PM
 */
public interface Bus {
  public void run();

  class smallBus implements Bus {
    @Override
    public void run() {
      {
        System.out.println("run");
      }
    }
  }

  public static void main(String[] args) {
    new smallBus().run();
  }
}
