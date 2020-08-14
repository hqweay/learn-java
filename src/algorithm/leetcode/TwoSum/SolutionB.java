package algorithm.leetcode.TwoSum;

import java.util.HashMap;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/14/20 8:34 PM
 */
public class SolutionB {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; ++i) {
      if (map.containsKey(nums[i])) {
        return new int[]{map.get(nums[i]), i};
      }
      map.put(target - nums[i], i);
    }
    return null;
  }
}
