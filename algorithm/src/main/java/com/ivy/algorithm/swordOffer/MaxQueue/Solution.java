package com.ivy.algorithm.swordOffer.MaxQueue;

public class Solution {
    public static void main(String[] args) {
        String[] operation = new String[]{"MaxQueue","max_value","pop_front","max_value","push_back","max_value","pop_front","max_value","pop_front","push_back","pop_front","pop_front","pop_front","push_back","pop_front","max_value","pop_front","max_value","push_back","push_back","max_value","push_back","max_value","max_value","max_value","push_back","pop_front","max_value","push_back","max_value","max_value","max_value","pop_front","push_back","push_back","push_back","push_back","pop_front","pop_front","max_value","pop_front","pop_front","max_value","push_back","push_back","pop_front","push_back","push_back","push_back","push_back","pop_front","max_value","push_back","max_value","max_value","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","push_back","push_back","pop_front","max_value","pop_front","max_value","max_value","max_value","pop_front","push_back","pop_front","push_back","push_back","pop_front","push_back","pop_front","push_back","pop_front","pop_front","push_back","pop_front","pop_front","pop_front","push_back","push_back","max_value","push_back","pop_front","push_back","push_back","pop_front"};
        String[] nums = new String[]{"[]","[]","[]","[]","[46]","[]","[]","[]","[]","[868]","[]","[]","[]","[525]","[]","[]","[]","[]","[123]","[646]","[]","[229]","[]","[]","[]","[871]","[]","[]","[285]","[]","[]","[]","[]","[45]","[140]","[837]","[545]","[]","[]","[]","[]","[]","[]","[561]","[237]","[]","[633]","[98]","[806]","[717]","[]","[]","[186]","[]","[]","[]","[]","[]","[]","[268]","[]","[29]","[]","[]","[]","[]","[866]","[]","[239]","[3]","[850]","[]","[]","[]","[]","[]","[]","[]","[310]","[]","[674]","[770]","[]","[525]","[]","[425]","[]","[]","[720]","[]","[]","[]","[373]","[411]","[]","[831]","[]","[765]","[701]","[]"};
        MaxQueue maxQueue = new MaxQueue();
        for (int i = 0; i < operation.length; i++) {
            if (operation[i].equals("max_value")) {
                maxQueue.max_value();
            } else if (operation[i].equals("pop_front")) {
                maxQueue.pop_front();
            } else if (operation[i].equals("push_back")) {
                String value = nums[i];
                value = value.replace("[", "").replace("]", "");
                maxQueue.push_back(Integer.parseInt(value));
            }
        }
    }
}
