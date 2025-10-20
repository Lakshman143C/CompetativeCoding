package org.laxman.striver.slidingwindow.constantWindow;

import java.util.Arrays;

public class FrequencyMostFreqEle {
    public static void main(String[] args) {

    }




    static public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.print(nums.length);
        int l = 0, r = 0, res = 0;
        long total = 0;
        while (r < nums.length) {
            total += nums[r];
            while (nums[r] * (r - l + 1) > total + k) {
                total -= nums[l];
                l++;
            }
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
}
