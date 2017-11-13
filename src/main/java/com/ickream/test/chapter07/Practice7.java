package com.ickream.test.chapter07;
import static java.lang.System.out;
/**
 * Created by xf on 2017/7/7.
 */
public class Practice7 {
    public static void main(String [] args){
        RoundGlyph roundGlyph=new RoundGlyph();
    }
}

class Glyph{
    int radis=1;
    void drow(){
        out.println(radis+"haha");
    }
    public Glyph(){
        out.println("before Glyph");
        drow();
        out.println("after Glyph");
    }
}
class RoundGlyph extends  Glyph{
    int radis=0;
    void drow(){
        out.println(radis+"heiheihei");
    }
    public RoundGlyph(){
        drow();
    }
}
