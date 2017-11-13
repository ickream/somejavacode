package com.ickream.test.chapter07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
/**
 * Created by xf on 2017/7/6.
 */
public class Practice5 {
    public static void main(String []args){
        B b=new B("hahaa");
        A.getUseA(b);
        String [] strings={"aa","bb","cc"};
        List<String > str=new ArrayList<String>();
        
        out.println(strings.length+"----"+ Arrays.asList(strings).contains("cc"));

    }
}
class A{
    public A( String str){
        out.println("this is a"+str);
    }
    private  void useA(){
        out.println("use a ");
    }
    public static void getUseA(A a){
        a.useA();
    }
}
class B extends A{
    B(String str){
        super(str);
        out.println("this is b");
    }
}
