package basic.util;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/17/20 11:14 AM
 */
public class OptionalTest {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int i = 0; i < 20; i++){
      arrayList.add(i);
    }
    arrayList.add(null);
    arrayList.add(null);
    arrayList.add(null);
    // arrayList.forEach(System.out::println);
    // Optional.ofNullable(arrayList).ifPresent(System.out::println);

    arrayList.forEach(item->{
      Optional.ofNullable(item).ifPresent(System.out::println);
    });


  }


}
