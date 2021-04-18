import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 2:45 PM
 */
public class SolutionB {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }

    int oneTimes = 0;
    int twoTimes = 0;
    int threeTimes = 0;
    int fourTimes = 0;
    int count = 0;

    for (int i = 0; i < N; i++) {
      if (arr[i] == 1) {
        oneTimes++;
      }
      if (arr[i] == 2) {
        twoTimes++;
      }
      if (arr[i] == 3) {
        threeTimes++;
      }
      if (arr[i] == 4) {
        fourTimes++;
      }
    }

    if (oneTimes > 0 && twoTimes > 0) {
      count = Math.abs(oneTimes - twoTimes);
      oneTimes = oneTimes > twoTimes ? count : 0;
      twoTimes = oneTimes > twoTimes ? 0 : count;
      threeTimes += count;
    }

    if (twoTimes > 0) {
      if (twoTimes % 2 == 0) {
        count += twoTimes / 2;
      } else {
        count += twoTimes / 2;
        twoTimes = 1;
        if (fourTimes > 0) {
          count++;
        } else {
          System.out.println(-1);
          return;
        }
      }
    }
    if (oneTimes > 0) {
      count += oneTimes / 4 * 3;
      oneTimes = oneTimes % 4;
      fourTimes += oneTimes / 4;
      count += oneTimes / 3 * 2;
      threeTimes += threeTimes / 3;
      if (oneTimes == 1 && fourTimes >= 2) {
        count += 2;
      } else if (oneTimes == 2 && fourTimes >= 1) {
        count += 2;
      } else {
        System.out.println("-1");
        return;
      }
    }

    System.out.println(count);


  }
}
