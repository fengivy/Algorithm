package com.ivy.algorithm.design.LRUCache;

import java.util.HashMap;
class LRUCache {
    class BothWayNode{
        public int val;
        public int key;
        public BothWayNode next;
        public BothWayNode pre;
    }
    private int capacity = 0;
    private int currentCapacity = 0;
    private BothWayNode head;
    private BothWayNode tail;
    private HashMap<Integer,BothWayNode> map =new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        BothWayNode node = map.get(key);
        if (node != null) {
            put(key,node.val);
            return node.val;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { //先删除
            BothWayNode node = map.get(key);
            map.remove(key);
            if (currentCapacity == 1) {
                head = null;
                tail = null;
            }else{
                if (node.next == null) {
                    if (node.pre == head) {
                        tail = head;
                        tail.next = null;
                    }else{
                        tail = node.pre;
                        tail.next = null;
                    }
                } else if (node.pre == null) {
                    if (node.next == tail) {
                        head = tail;
                        head.pre = null;
                    }else{
                        head = node.next;
                        head.pre = null;
                    }
                }else{
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
            }
            node.next = null;
            node.pre = null;
            currentCapacity--;
        }
        if (currentCapacity == 0) {
            addWhenEmpty(key,value);
        }else{
            if (currentCapacity == capacity) {
                map.remove(head.key);
                currentCapacity--;
                if (capacity == 1) {
                    head = null;
                    tail = null;
                }else{
                    BothWayNode temp = head;
                    head = head.next;
                    head.pre = null;
                    temp.next = null;
                }
            }
            if (currentCapacity == 0) {
                addWhenEmpty(key,value);
            }else{
                BothWayNode node = new BothWayNode();
                node.val = value;
                node.key = key;
                tail.next = node;
                node.pre = tail;
                tail = node;
                map.put(key,node);
                currentCapacity++;
            }
        }
    }

    private void addWhenEmpty(int key,int value) {
        head = new BothWayNode();
        head.key = key;
        tail = head;
        head.val = value;
        currentCapacity++;
        map.put(key,head);
    }
}
