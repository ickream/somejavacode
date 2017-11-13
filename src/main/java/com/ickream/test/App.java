package com.ickream.test;
import com.ickream.test.chapter07.*;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cartoon cartoon=new Cartoon();
        //System.out.println( "Hello World!" );
        LinkedList<String> link=new LinkedList<String>();
        link.add("ss");
        link.addFirst("aa");

        link.addLast("cc");
        link.add("ddd");

        Map<String,String > map=new HashMap<String, String>();
        map.put("k1","v1");
        map.put("K2","v2");
        System.out.println(map.keySet());
        List<String> li=new ArrayList<String>();
        li.add("sssss");
        li.addAll(Arrays.asList("ss","aa","vv"));
        Iterator<String> iterator=li.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"---hahahhaha");
        }

        //System.out.println(link.getFirst()+"----------"+link.getLast());
    }
}
