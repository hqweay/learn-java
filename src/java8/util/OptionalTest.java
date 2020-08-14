package java8.util;

import java.util.Optional;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/13/20 4:48 PM
 */
public class OptionalTest {
  public static void main(String[] args) {
    Optional.ofNullable("test")
            .ifPresent(name -> {
              System.out.println("ifPresent le" + name);
            });
  }
}
