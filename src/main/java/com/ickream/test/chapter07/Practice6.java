package com.ickream.test.chapter07;
import static java.lang.System.out;
/**
 * Created by xf on 2017/7/7.
 */
public class Practice6 {

    public static void main(String[] args){
        WithFinal override =new Override();
        override.g();
       // override.f();   向上转型不能引用导出类中扩展的方法
        override.gg();
        ((Override)override).f();   //向下转型，加一个强制类型转换
        //override.
    }
}
class WithFinal{
     void g(){
        out.println("final");
    }
    void gg(){
        out.println("zzzz");
    }
    private void ggg(){
        out.println("ddfff");
    }

}
class Override extends WithFinal{
    public void g(){
        out.println("override");
        //return 3;
    }
    public  void f(){
        out.println("hahaha");
    }
}
