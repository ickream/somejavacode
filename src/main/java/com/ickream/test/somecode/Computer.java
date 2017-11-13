package com.ickream.test.somecode;

import java.util.Stack;
import static  com.ickream.test.MyUtils.*;

/**
 * Created by xf on 2017/11/1.
 */
public class Computer {
    Stack<Character> number =new Stack<>();
    Stack<Character> operator=new Stack<>();
    public  String compute(String str){
        int num=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){}
            else if (c=='+'||c=='-'||c=='*'||c=='/') operator.push(c);
            else if(c>='0'&&c<='9') number.push(c);
            else if(c==')'&&operator.pop()=='+') {
                number.push((char)((number.pop()-'0')+(number.pop()-'0')));
            } else if (c == ')' && operator.pop() == '-') {
                number.push((char)(-(number.pop()-'0')+(number.pop()-'0')));
            }else if(c==')'&&operator.pop()=='*'){
                number.push((char)((number.pop()-'0')*(number.pop()-'0')));
            }else {
                number.push((char)(1/(number.pop()-'0')*(number.pop()-'0')));
            }

        }
        return number.pop().toString();
    }
    public static void main(String [] args){

        Computer computer=new Computer();
        String str=computer.compute("((1+3)*(5))");
        print(""+('4'-'2')+"---"+str);
    }

}
