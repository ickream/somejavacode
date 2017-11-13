package com.ickream.test.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xf on 2017/7/9.
 */
public class Prac1 {
    public static void main(String []args){
        B b=new B(8);
       System.out.print(b.getI());
        List<String> list=new ArrayList<String>();
        list.add("sss");
        list.add("ss");
        
        System.out.println(list.size()+"---------"+list.indexOf("ss"));
    }
}
abstract class A{
    private int i;

    public A(int i){
        this.setI(i);
        System.out.println(i+2);
    }
    public void setI(int x){
        this.i=x;
    }
    public int getI(){
        return i;
    }

}
class  B extends  A{
    public B(int i){
        super(i);
        this.setI(i);
    }

}
