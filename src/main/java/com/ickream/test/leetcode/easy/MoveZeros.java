package com.ickream.test.leetcode.easy;

import java.util.Arrays;

/**
 * Created by xf on 2017/7/20.
 */
public class MoveZeros {
    public  void moveZeroes(int[] nums) {
        for(int i=nums.length-2;i>=0;i--){
            for(int j=i;j<=nums.length-2;j++){
                if(nums[j+1]==0||nums[j]!=0)
                    break;
                nums[j]=nums[j]+nums[j+1];
                nums[j+1]=nums[j]-nums[j+1];
                nums[j]=nums[j]-nums[j+1];
            }
        }
    }
    public static  void main(String []args){
        MoveZeros m=new MoveZeros();
        int [] arr={2,0,9,23,0,1,3};
        System.out.println(Arrays.toString(arr)+"----");
        m.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
