package com.ivy.algorithm.grapha.CourseScheduleII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<Integer>());
        }
        int size = prerequisites.length;
        for (int i = 0; i < size; i++) {
            inDegree[prerequisites[i][0]] +=1;
            adjacency.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int num = queue.remove();
            result.add(num);
            List<Integer> sheet = adjacency.get(num);
            if (sheet.size() > 0) {
                for (int i = 0; i < sheet.size(); i++) {
                    inDegree[sheet.get(i)]-=1;
                    if (inDegree[sheet.get(i)] == 0) {
                        queue.add(sheet.get(i));
                    }
                }
            }
        }
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] > 0) {
                return new int[]{};
            }
        }
        int[] value = new int[result.size()];
        for (int i=0;i<result.size();i++) {
            value[i] = result.get(i);
        }
        return value;
    }
}
