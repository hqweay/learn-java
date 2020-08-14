package algorithm.leetcode.ReverseInteger;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/14/20 8:36 PM
 */
public class SolutionA {
  public int reverse(int x) {
    int sum = 0;
    while(true){
      sum = sum * 10 + x % 10;
      x = x / 10;
      if(x == 0){
        break;
      }
    }
    return sum;
  }
}
