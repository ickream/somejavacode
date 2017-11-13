package com.ickream.test.somepractice;

import java.util.Arrays;

/**
 * Created by xf on 2017/8/2.
 */
public class Dp2 {
    public static int[] dp(int [] arr){
        int [] d=new int[arr.length];
        int len=1;
        for(int i=0;i<arr.length;i++){
            d[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>=arr[j]&&d[i]<d[j]+1){
                    d[i]=d[j]+1;
                }
            }
            if(d[i]>len) len=d[i];
        }
        System.out.println(len+"----");
        return d;
    }
    public static void main(String []args){
        int [] arr={5,3,4,8,6,7};
        System.out.println(Arrays.toString(Dp2.dp(arr)));
    }
}
