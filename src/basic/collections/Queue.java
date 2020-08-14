package basic.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @description: TODO
 * Created by hqweay on 19-4-29 下午4:39
 */
public class Queue {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(3, new Comparator<Integer>(){
      @Override
      public int compare(Integer integer, Integer t1) {
        return t1.compareTo(integer);
      }
    });

    for(int i = 0; i < 10; i++){
      if(queue.size() != 4){
        queue.offer(i);
      }else if(queue.peek() > i){
        queue.poll();
        queue.offer(i);
      }
    }

    for(int i : queue){
      System.out.println(i);
    }
  }
}
