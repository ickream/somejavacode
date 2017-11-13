package com.ickream.test.chapter15;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xf on 2017/7/26.
 */
public class Prac1<T>{
//    static <T> void f(){
//        T a;
//        System.out.println();
//    }
    T t;

    public void setT(T t){
      this.t=t;
    }
    public T getT(){
        return t;
    }
    public void tostring(){
        System.out.println(t.getClass());
    }

    public static <T> List<T> generate(T ...args){
        List<T> list=new ArrayList<T>();
        for(T item:args){
            list.add(item);
        }
        return list;
    }
    // @Target(ElementType)
    public static void main(String [] args){
        Prac1<Cla> prac1=new Prac1<Cla>();
        prac1.setT(new Cla());
        prac1.tostring();

        int [][] arr=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        System.out.println(Arrays.deepToString(arr)+Cla.class);


    }

}
class Cla{
    private String s="ddddd";
    public String hen(){
        return s;
    }
}
