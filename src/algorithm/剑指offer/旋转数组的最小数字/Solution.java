package algorithm.剑指offer.旋转数组的最小数字;

/**
 * @description: TODO
 * Created by hqweay on 19-4-12 下午1:31
 */
public class Solution {
  public int find(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    int mid = (start + end)/2;

    while(start < end){
      if(arr[mid] >= arr[mid-1] && arr[mid] > arr[mid+1]){
        return arr[mid+1];
      }
      if(arr[mid] < arr[mid-1] && arr[mid] <= arr[mid+1]){
        return arr[mid];
      }

      if(arr[mid] >= arr[mid-1] && arr[mid] <= arr[mid+1]){
        if(arr[mid] <= arr[start]){
          end = mid-1;
          mid = (start+end)/2;
        }else{
          start = mid+1;
          mid = (start + end)/2;
        }
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    System.out.println(new Solution().find(new int[]{3,4,5,6,1,2}));
  }
}
