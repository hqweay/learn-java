package algorithm.剑指offer.丑数;

/*
* 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
* 例如6、8都是丑数，但14不是，因为它包含质因子7。
* 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
* */

public class Solution {

    public int GetUglyNumber_Solution(int index) {
      if(index <= 0) {return 0;}
      if(index < 7) {return index;}
      int[] temps = new int[index];// 存丑数
      temps[0] = 1;
      int t2 = 0, t3 = 0, t5 = 0;
      int i =1;
      while(i < index){
        temps[i] = Math.min(temps[t2]*2, Math.min(temps[t3]*3, temps[t5]*5));
        if(temps[i] == temps[t2]*2) {t2++;}
        if(temps[i] == temps[t2]*3) {t3++;}
        if(temps[i] == temps[t5]*2) {t5++;}
        i++;
      }
      return temps[index-1];
    }

  public static void main(String[] args) {
    System.out.println(new Solution().GetUglyNumber_Solution(8));
  }
}