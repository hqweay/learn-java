package basic.label;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/17/20 10:56 PM
 */
public class LabelTest {
  public static void main(String[] args) {
    test:
    for (int i = 1; i < 3; i++) {
      for (int j = 1; j < 3; j++) {
        if (i == 1 && j == 1) {
          continue test;
        }

        if (i == 2 && j == 2) {
          break test;
        }
        System.out.println(" i :" + i + " j : " + j);
      }
    }
  }
}
