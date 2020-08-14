package algorithm.剑指offer.调整数组顺序使奇数位于偶数前面;

public class Solution {
  public void reOrderArray(int [] array) {
    int j = 0, temp;
    for(int i = 0; i < array.length; i++){
      if((array[i] & 1) == 0){
//
      }else{
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
      }
      j++;
    }
  }

  public static void main(String[] args) {
    int[] arras = new int[7];
    int[] arr = {1,2,3,4,5,6,7};
    Solution solution = new Solution();
    solution.reOrderArray(arr);
    for(int i : arr){
      System.out.println(i);
    }
  }
}
