package com.ivy.algorithm.linkedList.AddTwoNumbers;

import com.ivy.algorithm.linkedList.bean.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode result = new ListNode(-1);
        ListNode point = new ListNode(-1);
        point.next = result;
        ListNode temp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                point.next.next = l2;
                break;
            }else if (l2 ==null){
                point.next.next = l1;
                break;
            }else{
                l1.val = l1.val + l2.val;
                if (l1.val >= 10) { //超过10了
                    if (l1.next != null) {
                        addOne(l1.next);
                    }else if(l2.next !=null){
                        addOne(l2.next);
                    }else{
                        l1.next = new ListNode(1);
                    }
                    l1.val = l1.val%10;
                }
                temp = l1.next;
                l1.next = null;
                point.next.next = l1;
                l1 = temp; //复用l1 l1跳到下一个
                point.next = point.next.next;
                l2 = l2.next; //l2下一个
            }
        }
        return result.next;
    }

    private void addOne(ListNode node) {
        ListNode point = new ListNode(-1);
        point.next = node;
        while (point.next!=null) {
            point.next.val+=1;
            if (point.next.val>= 10){
                if (point.next.next == null) {
                    point.next.val %=10;
                    point.next.next = new ListNode(0);
                }else{
                    point.next.val%=10;
                }
                point.next = point.next.next;
            }else{
               return;
            }
        }
    }
}
