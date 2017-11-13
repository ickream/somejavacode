package com.ickream.test.leetcode.easy;

import java.util.Arrays;

/**
 * Created by xf on 2017/7/22.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int dup=nums[0];
        int end =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=dup){
                nums[end]=nums[i];
                dup=nums[i];
                end++;
            }
        }
        return end;
    }



    public int myremoveDuplicates(int[] nums) {
        int i=0,tmp=nums.length;
        while(i<=tmp-2){
            if(nums[i]==nums[i+1]) {
                for(int j=i;j<=nums.length-2;j++){
                    nums[j]=nums[j+1];
                }
                tmp--;
            }else{
                i++;
                System.out.println("sss");
            }
            System.out.println(Arrays.toString(nums));
        }
        return tmp;
    }
    public static void main(String [] args){
        RemoveDuplicates re=new RemoveDuplicates();
        int[] arr={1,1};
        System.out.println(re.removeDuplicates(arr)+"-----------"+Arrays.toString(arr));
    }
}
