package algorithm.剑指offer.二维数组中的查找;

/**
 * @author: hqweay
 * @description: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Created on 8/14/20 8:32 PM
 */
public class Solution {
  public boolean Find(int target, int [][] array) {
    int high = array.length;
    int width = array[0].length;
    for(int i = 0, j = width-1; i < high&&j >= 0; ){
      if(target > array[i][j]){
        i++;
      }else if(target < array[i][j]){
        j--;
      }else{
        return true;
      }
    }
    return false;
  }
}
