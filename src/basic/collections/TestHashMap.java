package basic.collections;

import java.util.HashMap;

/**
 * @description: TODO
 * Created by hqweay on 2019/10/14 下午3:31
 */
public class TestHashMap {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    TestC xiaominkg = new TestC(10, "xiaominkg");
    TestC xiaohongkg = new TestC(10, "xiaominkg");

    System.out.println(xiaominkg.hashCode());
    System.out.println(xiaohongkg.hashCode());

    System.out.println();
  }
}
