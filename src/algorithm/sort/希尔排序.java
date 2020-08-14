package algorithm.sort;

/**
 * @description: TODO
 * Created by hqweay on 19-3-25 下午2:06
 */
public class 希尔排序 {
  public int[] sort(int[] arr){
    int len = arr.length;
    int h = 1;
    while(h < len/2){
      h = h*2;
    }
    while(h >= 1){
      for(int i = h; i < len; i++){
        for(int j = i; j >= h; j-=h){
          if(arr[i] < arr[j-h]){
            int temp = arr[i];
            arr[i] = arr[j-h];
            arr[j-h] = temp;
          }
        }
      }
      h /=2;

    }
    return arr;
  }

  public static void main(String[] args) {
    for(int i : new 希尔排序().sort(new int[]{1,2,3,5,7,4,3,2})){
      System.out.println(i);
    }
  }
}
