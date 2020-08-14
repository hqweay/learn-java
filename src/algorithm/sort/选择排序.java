package algorithm.sort;

/**
 * @description: TODO
 * Created by hqweay on 19-3-25 下午1:37
 */
public class 选择排序 {
  public int[] sort(int[] arr){
    int len = arr.length;
    for(int i = 0; i < len-1; i++){
      int min = i;
      for(int j = i + 1; j < len; j++){
        if(compareTo(arr[j], arr[min]) == 0){
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    return arr;
  }
  private int compareTo(int a, int b){
    return a>=b?1:0;
  }

  public static void main(String[] args) {
    for(int i : new 选择排序().sort(new int[]{1,2,3,8,6,5,7,1,4})){
      System.out.println(i);
    }
  }
}
