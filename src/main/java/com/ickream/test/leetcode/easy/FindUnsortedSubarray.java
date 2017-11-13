package com.ickream.test.leetcode.easy;

import java.util.Arrays;

/**
 * Created by xf on 2017/7/22.
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int [] arr=new int[nums.length];
        System.arraycopy(nums,0,arr,0,nums.length);
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        int  i=0,j=nums.length-1;
        while(i<=j&&arr[i]==nums[i])
            i++;
        while(j>=0&&arr[j]==nums[j])
            j--;
        return j-i+1>0?j-i+1:0;
    }
    public static void main(String []args){
        FindUnsortedSubarray f=new FindUnsortedSubarray();
        int [] arr={1,2,3,4};
       System.out.println(f.findUnsortedSubarray(arr)+"------------");
    }

}
