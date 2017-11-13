package com.ickream.test.somepractice;

import java.util.Arrays;

/**
 * Created by xf on 2017/7/31.
 */
public class Dp01 {
    public static int[] dp(int num){
        int [] arr=new int[num];
        for(int k=0;k<arr.length;k++){
            arr[k]=k;
        }
        arr[0]=0;
        int [] s={1,3,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<3;j++){
                if(i>=s[j]&&arr[i]>arr[i-s[j]]+1){
                    arr[i]=arr[i-s[j]]+1;
                }
            }
        }
        return arr;
    }
    public static void main(String []args){
        System.out.println(Arrays.toString(Dp01.dp(14))) ;
    }
}
