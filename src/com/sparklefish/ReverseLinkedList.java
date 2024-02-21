package com.sparklefish;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

  public static void main(String[] args) {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode test = new ListNode(1);
    ListNode test2 = new ListNode(2);
    ListNode test3 = new ListNode(3);
    ListNode test4 = new ListNode(4);
    test.next = test2;
    test2.next = test3;
    test3.next = test4;
    reverseLinkedList.reverseList(test);
  }

  public ListNode reverseList(ListNode head) {

    if (head == null) {
      return null;
    } else if (head.next == null) {
      return head;
    }
    int currentVal;
    LinkedList<Integer> toReverse = new LinkedList<>();

    toReverse.add(head.val);
    while (head.next != null) {
      head = head.next;
      toReverse.add(head.val);
    }

    Collections.reverse(toReverse);
    ListNode tail = new ListNode();
    ListNode temp = new ListNode();

    tail.val = toReverse.getFirst();
    for (int i = 1; i < toReverse.size(); i++) {
      tail.next = temp;
      temp.val = toReverse.get(i);
      temp.next = new ListNode();
      tail = temp.next;


    }

    return temp;
  }

}
