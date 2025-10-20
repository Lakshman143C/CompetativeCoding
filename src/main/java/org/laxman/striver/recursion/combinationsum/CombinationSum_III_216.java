package org.laxman.striver.recursion.combinationsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_III_216 {
    public static void main(String[] args) {
        combinationSum3(3,7);
    }
    static public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] nums = new int[10];
        find(k, n, 1, nums, res, list);
        return res;
    }

    static public void find(int k, int n, int i, int[] nums, List<List<Integer>> res, List<Integer> list) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(list));
            mark(nums, list);
            return;
        }
        list.add(i);
        if (i < 10 && nums[i] != 1)
            find(k - 1, n - i, i + 1, nums, res, list);
        if (i < 9 && nums[i + 1] != 1)
            find(k, n, i + 1, nums, res, list);
    }

    static public void mark(int[] nums, List<Integer> list) {
        for (int i=0;i<list.size();i++ )
            nums[list.get(i)] = 1;
    }
}
