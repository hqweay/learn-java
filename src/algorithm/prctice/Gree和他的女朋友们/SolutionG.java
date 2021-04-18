import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/5/20 2:18 PM
 */
public class SolutionG {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] arrA = new int[N];
    int[] arrB = new int[M];


    for (int i = 0; i < N; i++) {
      arrA[i] = scanner.nextInt();
    }
    for (int i = 0; i < M; i++) {
      arrB[i] = scanner.nextInt();
    }

    for(int i = 0; i < M; i++){
      int index = arrB[i];

      if(index > arrA.length){
        System.out.println(0);
      }

      int len = N - index + 1;

      for(int j = index - 1; j < N; j++){
        for(int k = j+1; k < N; k++){
          if(arrA[j] == arrA[k]){
            len--;
            break;
          }
        }
      }
      System.out.println(len);

    }


  }
}
