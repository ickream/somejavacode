package com.ickream.test.somecode;

import java.util.EnumSet;

import static com.ickream.test.MyUtils.*;
/**
 * Created by xf on 2017/11/2.
 */
public class EnumTest {
    public static  void main(String [] args){
        for(MyEnum myEnum:MyEnum.values()){
            print(myEnum.name()+"---"+myEnum.toString()+"---"+myEnum.ordinal());
            if(myEnum.compareTo(MyEnum.Thu)>=1){
                print(myEnum.name()+"*****"+myEnum.getDeclaringClass()+"**"+myEnum.getClass());
            }
        }
        MyEnum anEnum=MyEnum.Fri;
        print(anEnum.name());

        EnumSet<MyEnum> enumSet=EnumSet.range(MyEnum.Thu,MyEnum.Sat);
        Object[] enums= enumSet.toArray();
        for(Object aenum:enums){
            if(aenum instanceof MyEnum){
                print("is a enum");
                print(((MyEnum) aenum).ordinal()+""+MyEnum.class.isInstance(aenum));
            }
            String str=aenum.getClass().getSimpleName();
            print("hh"+((MyEnum)aenum).name()+"kkk"+aenum.getClass().getSimpleName());
        }
    }
}

 enum MyEnum{
    Mon("this is Monday"),Tue("this is Tuesday"),Wed("this is Wednesday"),Thu("this is Thuesday")
     ,Fri("this is Friday"),Sat("this is Saturday"),Sun("this is Sunday");
    private String describe;
    MyEnum(String str){
        this.describe=str;
    }

    @Override
    public String toString(){
        return "hhh---"+super.toString()+":is"+this.describe;
    }
    public String getDescribe(){
        return describe;
    }


}
