package algorithm.剑指offer.从尾到头打印链表;

import algorithm.global.ListNode;

import java.util.ArrayList;

/**
 * @author: hqweay
 * @description: 输入一个链表，从尾到头打印链表每个节点的值。
 * Created on 8/14/20 8:31 PM
 */
public class SolutionB {
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    ArrayList<Integer> list = new ArrayList<>();
    set(listNode, list);
    return list;
  }
  public void set(ListNode listNode, ArrayList list){
    if(listNode != null){
      set(listNode.next, list);
      list.add(listNode.val);
    }
  }
}
