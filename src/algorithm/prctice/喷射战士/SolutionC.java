import java.util.*;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/10/20 9:54 PM
 */
public class SolutionC {
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
    // 最终决战
    int[] temp = new int[wallCount];
    for (int i = 0; i < wallCount; i++) {
      temp[i] = -1;
    }
    // 给 temp 赋值
    for (int i = 0; i < wallCount; i++) {
      for (int j = i - 1; j >= 0; j--) {
        if (wall[j] == wall[i]) {
          temp[i] = j;
          break;
        }
      }
    }
    //
    int[] wallWithColor = new int[wallCount];
    int startColorIndex = 1;
    int max = -1;
    for (int i = 0; i < wallCount; i++) {
      if (temp[i] == -1) {
        if (max != colorCount && max >= startColorIndex) {
          startColorIndex = max + 1;
        }
        wallWithColor[i] = startColorIndex++;
        if (startColorIndex > colorCount) {
          startColorIndex = 1;
        }
      } else {
        int preColor = wallWithColor[temp[i]];
        if (preColor == colorCount) {
          wallWithColor[i] = 1;
        } else {
          wallWithColor[i] = preColor + 1;
        }
        max = wallWithColor[i] > max ? wallWithColor[i] : max;
      }
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
