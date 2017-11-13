package com.ickream.test.leetcode.easy;



/**
 * Created by xf on 2017/7/9.
 */
public class TwoSum {
    public int [] twosum(int[] nums,int target){
        int[] tmp=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    tmp[0]=nums[i];
                    tmp[1]=nums[j];
                    break;
                }
            }
        }
        return  tmp;
    }

}
