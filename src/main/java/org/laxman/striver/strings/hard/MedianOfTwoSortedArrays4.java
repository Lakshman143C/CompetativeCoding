package org.laxman.striver.strings.hard;

public class MedianOfTwoSortedArrays4 {
    public static void main(String[] args) {
//        int[] nums1={1,3,8,9,15};
//        int[] nums2={7,11,18,19,21,25};
        int[] nums1={1,3};
        int[] nums2={2};
        findMedianSortedArrays(nums1,nums2);
    }
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //swap if nums1 len is gt than nums2
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2,nums1);
        }
        int l = 0, r = nums1.length - 1;
        int m1 = 0, m2 = 0, ln2 = (nums1.length + nums2.length + 1) / 2;
        int lx = 0, rx = 0, ly = 0, ry = 0;
        double res = 0.0;
        while (l <= r) {
            m1 = (l + r) >> 1;
            m2 = ln2 - m1;
            lx = m1 > 0 ? nums1[m1 - 1] : Integer.MIN_VALUE;
            rx = m1 < nums1.length ? nums1[rx] : Integer.MAX_VALUE;
            ly = m2 > 0 ? nums2[m2 - 1] : Integer.MIN_VALUE;
            ry = m2 < nums2.length ? nums2[m2] : Integer.MAX_VALUE;
            if (lx <= ry && ly <= rx) {
                if ((nums1.length + nums2.length) % 2 != 0) {
                    return (double) Math.max(lx, ly);
                } else {
                    return (Math.max(lx, ly) +
                            Math.min(rx, ry)) / 2.0;
                }
                //break;
            } else if (lx > ry) {
                r = m1 - 1;
            } else {
                l = m1 + 1;
            }
        }
        return res;
    }
}
