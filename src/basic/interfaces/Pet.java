package basic.interfaces;

/**
 * @description: TODO
 * Created by hqweay on 19-4-29 上午10:33
 */
public interface Pet {
  public int age = 15;
  public void run();

  public default void runa(){
    System.out.println("aaaaa");
  }

}
