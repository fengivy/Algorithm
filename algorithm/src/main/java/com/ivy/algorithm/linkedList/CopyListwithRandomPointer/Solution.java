package com.ivy.algorithm.linkedList.CopyListwithRandomPointer;

import java.util.HashMap;

public class Solution {
    private class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node,Node> hashMap = new HashMap<>();
        return copy(hashMap,head);
    }

    private Node copy(HashMap<Node, Node> hashMap, Node head) {
        if (hashMap.containsKey(head)) {
            return hashMap.get(head);
        }
        Node node = new Node(head.val);
        hashMap.put(head,node);
        Node next = head.next;
        if (next != null) {
            if (hashMap.containsKey(next)) {
                node.next = hashMap.get(next);
            }else{
                node.next = copy(hashMap,next);
            }
        }

        Node random = head.random;
        if (random != null) {
            if (hashMap.containsKey(random)) {
                node.random = hashMap.get(random);
            } else{
                node.random = copy(hashMap,random);
            }
        }
        return node;
    }
}
