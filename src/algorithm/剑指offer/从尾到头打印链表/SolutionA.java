package algorithm.剑指offer.从尾到头打印链表;

import algorithm.global.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author: hqweay
 * @description: 输入一个链表，从尾到头打印链表每个节点的值。
 * Created on 8/14/20 8:30 PM
 */
public class SolutionA {
  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    Stack<Integer> stack =  new Stack<>();
    while(listNode != null){
      stack.push(listNode.val);
      listNode = listNode.next;
    }
    ArrayList<Integer> list = new ArrayList<>();
    while(!stack.isEmpty()){
      list.add(stack.pop());
    }
    return list;
  }
}
