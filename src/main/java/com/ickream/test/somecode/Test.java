package com.ickream.test.somecode;

import org.omg.CORBA.ObjectHelper;


/**
 * Created by xf on 2017/10/24.
 */
import java.lang.reflect.Constructor;

import static com.ickream.test.somecode.MyUtils.print;

public class Test {
    public int x=32;
//    public Test(){
//
//        print("origin x:"+x);
//        x=22;
//    }
    public Test(String str) {
        System.out.println(str);
    }

    public Test(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public static void main(String[] args) throws Exception {
        Constructor<Test> constructorStr = Test.class.getConstructor(String.class);
        constructorStr.newInstance("Hello, world!");

        Constructor<Test> constructorInts = Test.class.getConstructor(int.class, int.class);
        constructorInts.newInstance(2, 3);
    }
}

class SubTest extends  Test implements  Cloneable{
    {
        print(super.x+"");
        //print(y+"");
    }
    private  final  int xx;
    //private final A a=new A(32);

    @Override
    public Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
   // int y=4;
    public SubTest(){
        super("str");
        print("subTest init");
        this.xx=33;
    }
    public static void main(String args[]) throws  CloneNotSupportedException{
        SubTest subTest=new SubTest();

        SubTest subTest1=(SubTest) subTest.clone();
        if (subTest!=subTest1){
            print("colne success!");
        }

//        for(int i=1;i<=100;i++){
//            if(i%3==0&&i%5==0){
//                print("FizzBuzz"+i);
//            }else if(i%3==0){
//                print("Fizz");
//            }else if(i%5==0){
//                print("Buzz");
//            }else{
//                print(""+i);
//            }
//        }

    }
}

 class A{
    public int w;
    public A(int w){
        this.w=w;
    }

//    @Override
//    public boolean equals(Object obj){
//
//    }

}