package java8.stream;

import java.util.ArrayList;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 6/1/20 10:30 AM
 */
public class StreamTest {
  public static void main(String[] args) {

    ArrayList<String> strs = new ArrayList<>();
    strs.add("o");
    strs.add("tw");
    strs.add("thr");
    strs.add("four");
    strs.stream().map(String::length).forEach(System.out::println);

   
  }
}
