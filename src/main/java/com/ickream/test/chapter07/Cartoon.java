package com.ickream.test.chapter07;
import static java.lang.System.out;
/**
 * Created by xf on 2017/7/6.
 */
class Art{
    Art(){
       out.println("this is art!");
    }
}
public class Cartoon extends  Art {
    public Cartoon(){
        out.println("this is catroon!");
    }
    public static void main(String[] args){
        //Art art =new Art();
        Cartoon cartoon=new Cartoon();
    }
}
