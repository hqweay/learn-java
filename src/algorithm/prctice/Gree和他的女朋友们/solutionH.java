
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/5/20 2:36 PM
 */
public class solutionH {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    long[] arrA = new long[N];
    int[] arrB = new int[M];

    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextLong();
    }
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }

    LinkedHashSet set = new LinkedHashSet();

    for (int i = 0; i < M; i++) {
      int index = arrB[i];

      if(index > N){
        System.out.println(0);
      }

      int len  = N - index;
      if(set.size() > len){
        for(int j = arrB[i-1] - 1; j < index - 1; j++){
          set.remove(arrB[j]);
        }
      }

      for(int j = N-1; j >= index-1; j--){
        // if(!set.contains(arrA[j])){
          set.add(arrA[j]);
        // }
      }
      System.out.println(set.size());
    }
  }
}
