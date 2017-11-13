package com.ickream.test.somecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.ickream.test.MyUtils.*;

/**
 * Created by xf on 2017/10/23.
 */
public class Test02 {

    public static void main(String args[]){
        Set<String> stringSet =new HashSet<>();
         String str="sd-af";
         System.out.println(Arrays.toString(str.split("-")) );
        print("saasas");
        Test02 test02=new Test02();
        Game game=test02.new AGame();
        print(game.getClass().getSimpleName()+"sasasasas");
    }


    class AGame implements  Game{

        @Override
        public void someGame(){
            print("AGame");
        }
    }

}


interface Game{
    void someGame();
}
