package com.ivy.algorithm.string.SimplifyPath;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        if (path == null||path.length() == 0) {
            return "/";
        }
        path = path.replaceAll("[/]+","/"); //去掉多余的/
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < paths.length; i++) {
            String p = paths[i].trim();
            if ("..".equals(p)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else if (p.length()!=0&&!".".equals(p)){
                stack.add(p);
            }
        }
        sb.delete(0, sb.length());
        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop());
            sb.insert(0,"/");
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }
}
