package com.ivy.algorithm.grapha.CourseSchedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        int size = prerequisites.length;
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < size; i++) {
            inDegree[prerequisites[i][1]]++; //入度加1
            adjacency.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) { //记录入度为0的个数
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        if (queue.isEmpty()) {
            return false;
        }
        while (!queue.isEmpty()) {
            int num = queue.remove();
            numCourses--;
            List<Integer> sheet = adjacency.get(num);
            for (int i = 0; i < sheet.size(); i++) {
                inDegree[sheet.get(i)]-=1;
                if (inDegree[sheet.get(i)] == 0) {
                    queue.add(sheet.get(i));
                }
            }
        }

        return numCourses==0;
    }
}
