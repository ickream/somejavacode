package com.ickream.test.somecode;

/**
 * Created by xf on 2017/10/16.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.*;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xf on 2017/10/16.
 */
public class Test01 {
    private String var1="sa";

        public static void main(String args[]) throws  Exception{
        List<String> list=new ArrayList<String>();
        String var1="dd";
        list.add(new String("ss"));
        System.out.println(var1+new ArrayList<String>().getClass());
        Mnap<Obj> mnap=new Mnap<Obj>(new Obj(),Obj.class);
        //mnap.f();
        //Mnap<String> mnap =new Mnap<String>(new String("dsd"),);
        mnap.ff(new Obj());
        //Obj oo=new Obj();
        //Obj.class.newInstance();
        Class<?> ca=Obj.class;
        ca.newInstance();
        Method [] methods=ca.getMethods();
        System.out.println(Arrays.toString(methods));

        Constructor [] constructors=ca.getConstructors();


        //Class类型必须是明确指向的类型 构造方法必须为public，
        // 否则会抛出NoSuchMethodException异常
        Constructor<Obj> constructor=((Class<Obj>)ca).getConstructor(String.class);
        Obj ob=(Obj) constructor.newInstance("zheli shi hhh");

        Class<?>[] parameters=constructor.getParameterTypes();

        System.out.println(Arrays.toString(parameters));
        ArrayList li=new ArrayList();

        li.add(new Obj());

        Obj d=new Obj();
        System.out.println(li.get(0).getClass().isInstance(new Obj()));

        if(li.get(0) instanceof Obj){
                System.out.println(li.get(0).getClass().getSimpleName()+"-----class name");

        };
        ArrayList<String> list1=new ArrayList<String>(Arrays.asList("str1","str2","str3","str33"));
        Iterator<String > iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"------iter");
            iterator.remove();
            System.out.println(list1.size()+"------");
        }



    }
}

class Obj{
    public Obj(){
        System.out.println("Obj 初始化");
    }
    public Obj(String str){
        System.out.println("Obj 带参数的初始化---"+str);
    }
    public void foo(){
        System.out.println("=========================aaaaa=================");
    };
}
class Mnap<T>{
    Class<T> cl;
    T obj;
    public Mnap(T obj,Class<T> cl){
        this.obj=obj;
        this.cl=cl;
    }
    public void f(){

        System.out.println(obj.getClass());
        //Class cl=obj.getClass();
        //cl.newInstance();

    }
    public void ff(Object arg){
        boolean bol=cl.isInstance(arg);
        System.out.println(bol);

    }
}
class Building {}
class House extends Building {}
