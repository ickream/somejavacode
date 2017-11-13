package com.ickream.test.somecode;

import java.util.Base64;

import  static  com.ickream.test.MyUtils.*;
/**
 * Created by xf on 2017/10/11.
 */

/**
 * 普通内部类隐含了一个对外部对象的一个引用
 * 静态内部类不是这样
 */
public class InnerClassTest {

    private String str="dsd";
    public void foo(){
        print("outer method");
    }
    public class Inner01{
        public void printA(){
            System.out.println("a---outer:"+str);
            InnerClassTest.this.foo();
            foo();
        }

    }

    public static class Inner02{
        public void printStatic(){
            System.out.println("static inner b");
        }
    }
//    public InnerX test01(){
//        class InnerX{
//
//        }
//        return new InnerX();
//    }
    public Inner01 scall(){
        class Innn extends Inner01{
            public String ss;
            public Innn(String str ){
                this.ss=str;
            }
            public void ff(){
                print("innnn hhh");
            }
        }
        Innn innn=new Innn("dsdsd");
        return  innn;
    }
    public Content innCont(String x){
        int i= 33;              //虽然没有显示声明但是i为final类型
        Content content=new Content() {
            public String str=x;
//            i=788;
            @Override
            public String value() {
                return str+i;
            }
        }; //分号标记的是表达式的结束而不是内部类的结束
        return content;
    }

    public Wrap getWrap(int i){
        return new Wrap(i){
            @Override
            public int value(){
                return super.i;
            }
        };
    }
    public static void main(String args[]){
        InnerClassTest innerClassTest =new InnerClassTest();
        InnerClassTest.Inner01 inner01= innerClassTest.new Inner01();
        InnerClassTest.Inner02 inner02= new InnerClassTest.Inner02();
       // innerClassTest.test01();
        inner01.printA();
        inner02.printStatic();
        Content con= innerClassTest.innCont("we");
        print(con.value()+"--");
        Inner01 in=innerClassTest.scall();

        Wrap wrap=innerClassTest.getWrap(3);
        print("ddddd--"+wrap.value());


    }
}

interface  Content{

    String value();
}

 class Wrap{
    public int i;
    public Wrap(int i){
        this.i=i;
    }
    public int value(){
        return 3222;
    }
}