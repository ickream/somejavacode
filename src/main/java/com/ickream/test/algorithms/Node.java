package com.ickream.test.algorithms;

import static com.ickream.test.MyUtils.*;

import java.util.regex.Pattern;
/**
 * Created by xf on 2017/11/6.
 */
public class Node <T> {
    private T item;
    private Node<T> next;

    public Node (){}
    public Node(T item,Node next){
        this.item=item;
        this.next=next;
    }

    public T getItem(){
        return this.item;
    }
    public void setItem(T item){
        this.item=item;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setNext(Node<T> next){
        this.next=next;
    }

    public static void main(String [] args){
        Node<String> node=new Node<>();
        node.setItem("hh");
        Node first;
        first=node;
        Node<String> secNode=new Node<>();
        secNode.setItem("ee");

        first=secNode;
        first.setNext(node);
        Node<String> item=first;
        while(item!=null){
            print(item.getItem());
            item=item.getNext();
        }

    }
}
