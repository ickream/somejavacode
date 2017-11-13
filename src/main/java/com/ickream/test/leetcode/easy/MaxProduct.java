package com.ickream.test.leetcode.easy;

import java.util.Arrays;

/**
 * Created by xf on 2017/7/22.
 */
public class MaxProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int length=nums.length;
        int max1=nums[length-1]*nums[length-2]*nums[length-3];
        int max2=nums[length-1]*nums[0]*nums[1];
        return max1>max2?max1:max2;
    }
}
