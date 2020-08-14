package algorithm.leetcode.TwoSum;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/14/20 8:34 PM
 */
public class SolutionA {
  public int[] twoSum(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++){
      for(int j = i + 1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
