import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 4:27 PM
 */
public class Test {
  public static void main(String[] args) {

    LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    map.put(5, 6);
    map.put(1, 6);
    map.put(9, 6);

    for (Integer i : map.keySet()) {
      System.out.println(i);
    }

  }
}
