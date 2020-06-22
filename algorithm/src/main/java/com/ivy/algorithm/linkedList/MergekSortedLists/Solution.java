package com.ivy.algorithm.linkedList.MergekSortedLists;

import com.ivy.algorithm.linkedList.bean.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ArrayList<ListNode> nodes = new ArrayList<>(Arrays.asList(lists));
        for (int i = nodes.size() - 1; i >= 0; i--) { //移除null
            if (nodes.get(i) == null) {
                nodes.remove(i);
            }
        }
        sortList(nodes); //排序
        ListNode result = new ListNode(-1);
        ListNode point = result;
        while (nodes.size()>0) {
            ListNode node = nodes.get(0);
            point.next = node;
            point = node;
            if (node.next == null) {
                nodes.remove(0);
            }else{
                nodes.set(0,node.next);
                binaryInsert(nodes);
            }
            node.next = null;
        }
        return result.next;
    }

    private void binaryInsert(ArrayList<ListNode> lists) {
        if (lists.size() == 1) {
            return;
        }
        int begin = 1;
        int end = lists.size()-1;
        int initPosition = 0;
        while (begin + 1 < end) {
            int middle = begin+(end-begin)/2;
            if (lists.get(middle).val == lists.get(initPosition).val) {
                begin = middle;
            } else if (lists.get(initPosition).val > lists.get(middle).val) {
                begin = middle;
            }else{
                end = middle;
            }
        }
        ListNode initNode = lists.get(initPosition);
        if (lists.get(initPosition).val < lists.get(begin).val) {
            lists.add(begin,initNode);
        } else if (lists.get(initPosition).val < lists.get(end).val) {
            lists.add(end,initNode);
        }else{
            if (end == lists.size() - 1) {
                lists.add(initNode);
            }else{
                lists.add(end+1,initNode);
            }
        }
        lists.remove(0);
    }

    private void sortList(ArrayList<ListNode> lists) {
        Collections.sort(lists, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
    }
}
