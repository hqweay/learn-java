import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/10/20 9:54 PM
 */
public class SolutionD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int wallCount = scanner.nextInt();
    int colorCount = scanner.nextInt();

    int[] wall = new int[wallCount];

    for (int i = 0; i < wallCount; i++) {
      wall[i] = scanner.nextInt();
    }
    //颜色用不完 颜色不够
    if (wallCount < colorCount || maxRepeatedCount(wall) > colorCount) {
      System.out.println("NO");
      return;
    }
    if (wallCount == colorCount) {
      System.out.println("YES");
      for (int i = 0; i < wallCount; i++) {
        System.out.println(i + 1);
      }
      return;
    }

    //
    int[] wallWithColor = new int[wallCount];
    for (int i = 0; i < colorCount; i++) {
      wallWithColor[i] = i + 1;
    }

    for (int i = colorCount; i < wallCount; i++) {
      int tempWall = wall[i];
      int min = 1;
      int max = colorCount;
      for (int j = 0, k = i - 1; j < k; j++) {
        if (wall[j] == tempWall) {
          min = wallWithColor[j];
        }
        if (wall[k] == tempWall) {
          max = wallWithColor[k];
        }
      }
      wallWithColor[i] = min + 1;
    }


    System.out.println("YES");
    for (int i = 0; i < wallCount; i++) {
      System.out.println(wallWithColor[i]);
    }


  }

  public static int maxRepeatedCount(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int value = arr[i];
      if (map.containsKey(arr[i])) {
        int count = map.get(arr[i]);
        map.put(value, count + 1);
      } else {
        map.put(value, 1);
      }
    }
    Collection<Integer> collection = map.values();
    return Collections.max(collection);
  }
}
