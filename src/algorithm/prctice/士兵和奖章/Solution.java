package ss1;

import java.util.*;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 9/12/20 3:44 PM
 */
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int i = 1; i < N; i++) {
      if (arr[i] == arr[i - 1]) {
        if (map.containsKey(arr[i])) {
          map.put(arr[i], map.get(arr[i] + 1));
        } else {
          map.put(arr[i], 1);
        }
      }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < N - 1; i++) {
      if (arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1]) {
        for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
          list.add(j);
        }
      }
    }

    int gogo = map.firstKey();

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) < gogo) {
        list.remove(i);
      }
    }


    int count = 0;
    int max = arr[N - 1] + 1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      for (int i = 0; i < entry.getValue(); i++) {
        if (!list.isEmpty()) {
          int temp = list.remove(0);
          if (temp < entry.getKey()) {
            continue;
          } else {
            count = temp - entry.getKey();
          }
        } else {
          count = max - entry.getValue();
          max++;
        }
      }
    }
    System.out.println(count);

  }
}
