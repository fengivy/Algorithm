package com.ivy.algorithm.swordOffer.MaxQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
    class MaxInfo{
        public int num;
        public int count;

        public MaxInfo(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
    private Queue<Integer> queue = new LinkedList<Integer>();
    private Deque<MaxInfo> maxQueue = new LinkedList<MaxInfo>();

    public MaxQueue() {

    }

    public int max_value() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.getFirst().num;
    }

    public void push_back(int value) {
        queue.add(value);
        if (maxQueue.isEmpty()) {
            maxQueue.add(new MaxInfo(value,1));
        }else{
            MaxInfo maxInfo = new MaxInfo(value,1);
            while (!maxQueue.isEmpty()&&value >= maxQueue.getLast().num) {
                maxInfo.count+=maxQueue.getLast().count;
                maxQueue.removeLast();
            }
            maxQueue.add(maxInfo);
        }
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        if (maxQueue.getFirst().count == 1) {
            maxQueue.removeFirst();
        }else{
            maxQueue.getFirst().count -=1;
        }
        return queue.remove();
    }
}