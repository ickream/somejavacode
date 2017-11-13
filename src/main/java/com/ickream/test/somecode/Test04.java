package com.ickream.test.somecode;

import java.util.HashSet;
import java.util.Set;
import static com.ickream.test.MyUtils.*;

/**
 * Created by xf on 2017/10/31.
 */
public class Test04 {
    private String str="sdt";
    {
        print(str);
    }
    public static void main(String [] args){
        Test04 tt=new Test04();
        Set<SetTest> set=new HashSet<>();
        SetTest test=new SetTest(4);
        SetTest t=test;
        set.add(test);
        set.add(t);
        set.add(new SetTest(2));         //set 添加对象的时候比较的是对象的引用是否相等，重写equals方法也不行
        set.add(new SetTest(2));
        print(set.size()+"  "+(new SetTest(3)).equals(new SetTest(3)));

        Set<String> sset=new HashSet<>();
        sset.add("sdsd");
        sset.add("sdsd");
        print(sset.size()+"aaaaa"+("ss"==new String("ss")));
        SetTest setTest=new SetTest(3);
        //setTest.equals()
        for(SetTest sss :set){
            print("weewew  "+sss.i);
        }
    }
}

class SetTest{
    public int i;
    SetTest(int i){
        this.i=i;

    }
    @Override
    public boolean equals(Object ss){
            return  ss instanceof SetTest &&i==((SetTest)ss).i;
    }

}
