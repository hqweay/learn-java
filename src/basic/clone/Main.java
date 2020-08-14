package basic.clone;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/15 下午2:16
 */
public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {
    Persion A = new Persion("wang",23);

    System.out.println(A.getArr(5));

    Persion B = (Persion) A.clone();


    A.setArr(5,66);

    System.out.println(A.getArr(5));
    System.out.println(B.getArr(5));
  }
}
