package algorithm.leetcode.PalindromeNumber;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/14/20 8:36 PM
 */
public class SolutionA {
  public boolean isPalindrome(int x) {
    //if (x < 0) return false;
    String str = Integer.toString(x);
    int len = str.length();
    for(int i = 0, j = len - 1; i < j; i++, j--){
      if(str.charAt(i) != str.charAt(j)){
        return false;
      }
    }
    return true;
  }
}
