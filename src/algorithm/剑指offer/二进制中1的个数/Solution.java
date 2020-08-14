package algorithm.剑指offer.二进制中1的个数;

/**
 * @description: TODO
 * Created by hqweay on 19-4-12 下午1:55
 */
public class Solution {
  public int NumberOf1(int n) {
    int sum = 0;
    while(true){
      if(n == 0) {
        return sum;
      }
      sum += n&1;
      n = n>>>1;
    }
  }

  public static void main(String[] args) {
    System.out.println(new Solution().NumberOf1(-1));
  }
}
