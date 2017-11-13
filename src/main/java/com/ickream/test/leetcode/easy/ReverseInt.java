package com.ickream.test.leetcode.easy;


/**
 * Created by xf on 2017/7/9.
 */
public class ReverseInt {
    public int reverse(int x) {
        String xstr=(new Integer(x)).toString();
        int num=0;
        for(int i=xstr.length()-1;i>=0;i--){
            if(xstr.charAt(i)!='-')
                num=num*10+xstr.charAt(i)-'0';
        }
        if(x<0) num=0-num;
        return num;
    }
    public int rev(int x){
        int num=0;
        while(x>=10||x<=-10){
            num=num*10+x%10;
            x=x/10;
        }
        num=num*10+x;
        return num;
    }
    public  static void main(String []args){
        ReverseInt rev=new ReverseInt();
        int x=rev.reverse(123);
        System.out.println(x+"   "+-12%10+"   "+rev.rev(-123));
    }

}
