package com.ivy.algorithm.array.WordBreakII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    class Result {
        public boolean isSuccess;
        public List<List<Integer>> list;

        public Result(boolean isSuccess,List<List<Integer>> list) {
            this.isSuccess = isSuccess;
            this.list = list;
        }
    }

    class WordDictList{
        public int length;
        public String str;

        public WordDictList(int length, String str) {
            this.length = length;
            this.str = str;
        }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (wordDict == null || wordDict.size() == 0 || s == null) {
            return new ArrayList<>();
        }
        if (!allDigitIsRight(s,wordDict)) {
            return new ArrayList<>();
        }
        List<WordDictList> wordList =  format(wordDict);
        int size = s.length();
        Result[] f =new Result[size+1];
        f[0] = new Result(true,new ArrayList<List<Integer>>());
        for(int i=1;i<=size;i++){
            f[i] = new Result(false,new ArrayList<List<Integer>>());
            for (int j = 0; j < wordList.size(); j++) {
                int index = i-wordList.get(j).length;
                if (index < 0) {
                    continue;
                }
                if (!f[index].isSuccess){
                    continue;
                }
                if (!wordList.get(j).str.equals(s.substring(index,i))){
                    continue;
                }
                f[i].isSuccess = true;
                if (f[index]==null||f[index].list.isEmpty()) {
                    List<Integer> nums =new ArrayList<>();
                    nums.add(j);
                    f[i].list.add(nums);
                }else{
                    for(List<Integer> nums:f[index].list){
                        List<Integer> newNums = new ArrayList<>(nums);
                        newNums.add(j);
                        f[i].list.add(newNums);
                    }
                }
            }
        }
        if (f[size].isSuccess) {
            List<String> result = new ArrayList<>();
            for (List<Integer> list : f[size].list) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    sb.append(wordDict.get(list.get(i)));
                    if (i != list.size()-1)
                        sb.append(" ");
                }
                result.add(sb.toString());
            }
            return result;
        }else{
            return new ArrayList<String>();
        }
    }

    private boolean allDigitIsRight(String s, List<String> wordDict) {
        Set<Character> set = new HashSet<>();
        for (String str : wordDict) {
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private List<WordDictList> format(List<String> wordDict) {
        List<WordDictList> list = new ArrayList<>();
        for (String str : wordDict) {
            list.add(new WordDictList(str.length(),str));
        }
        return list;
    }
}
