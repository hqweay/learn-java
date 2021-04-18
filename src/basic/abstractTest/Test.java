package basic.abstractTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/20/20 10:15 PM
 */
public class Test {
  public void test(List<Object> list) {
  }

  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    list.add(new Test());
    new Test().test(list);

    HashMap<String, String> map = new HashMap<>();
    map.put(null, null);
    Hashtable<String, String> hashtable = new Hashtable<>();
    hashtable.put("ss", null);
    System.out.println(hashtable.get("ss"));

  }
}
