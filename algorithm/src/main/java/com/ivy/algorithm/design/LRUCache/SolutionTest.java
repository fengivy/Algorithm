package com.ivy.algorithm.design.LRUCache;

import javax.sound.midi.Soundbank;

public class SolutionTest {
    public static void main(String[] args) {
//        LRUCache cache = new LRUCache( 1 /* 缓存容量 */ );
//
//        cache.put(2, 1);
//        System.out.println(cache.get(2));
//        cache.put(3, 2);
//        System.out.println(cache.get(2));
//        System.out.println(cache.get(3));

        LRUCache cache = new LRUCache(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        System.out.println(cache.get(4));
        System.out.println(cache.get(3));
        System.out.println(cache.get(2));
        System.out.println(cache.get(1));
        cache.put(5,5);
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        System.out.println(cache.get(5));



//        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));;     // 返回  1
//        cache.put(3, 3);    // 该操作会使得关键字 2 作废
//        System.out.println(cache.get(2));       // 返回 -1 (未找到)
//        cache.put(4, 4);    // 该操作会使得关键字 1 作废
//        System.out.println(cache.get(1));      // 返回 -1 (未找到)
//        System.out.println(cache.get(3));       // 返回  3
//        System.out.println(cache.get(4));       // 返回  4
    }
}
