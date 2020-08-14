package algorithm.leetcode.ReverseInteger;

/**
 * @author: hqweay
 * @description: https://github.com/Blankj/awesome-java-leetcode/tree/master/note/007
 * Created on 8/14/20 8:35 PM
 */
public class SolutionB {
  public int reverse(int x) {
    long res = 0;
    for (; x != 0; x /= 10)
      res = res * 10 + x % 10;
    return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
  }
}
