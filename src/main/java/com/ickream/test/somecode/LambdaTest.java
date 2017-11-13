package com.ickream.test.somecode;


import java.util.function.Predicate;

import static com.ickream.test.MyUtils.*;

/**
 * Created by xf on 2017/10/29.
 */
public class LambdaTest
{
    public static void main(String [] args){

        ReturnSomeNumber returnSomeNumber=()->34;
        print(returnSomeNumber.someNumber()+"");
        Predicate<Integer> predicate=(Integer num)->num>12;

        print(predicate.test(12)+"");
        predicateTest("hh",(String str)->str.equals("hh"));

    }
    public static void predicateTest(String str,Predicate<String> predicate){
        if(predicate.test(str)){
            print("dddddd");
        }
    }

}
interface ReturnSomeNumber{
    public int someNumber();
}
