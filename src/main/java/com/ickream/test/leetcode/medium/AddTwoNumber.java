package com.ickream.test.leetcode.medium;

import java.util.List;

/**
 * Created by xf on 2017/7/10.
 */
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       // return getNode(l1,l2,0);
        return getNodeIter(l1,l2);
    }
    public ListNode getNode(ListNode l1,ListNode l2,int carry){
        if(l1==null&&l2==null){
            return carry==0?null:new ListNode(carry);
        }else if(l1==null||l2==null){
            l1=l2==null?l1:l2;
            l2=new ListNode(0);
        }
        ListNode cur=new ListNode((l1.val+l2.val+carry)%10);
        carry=(l1.val+l2.val+carry)/10;
        cur.next=getNode(l1.next,l2.next,carry);
        return cur;
    }


    public ListNode getNodeIter(ListNode l1,ListNode l2){
        int carry=l1.val+l2.val;
        ListNode hNode=new ListNode(carry%10);
        ListNode l=hNode;
        carry=carry/10;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null||l2!=null){
            if(l1==null||l2==null){
                l1=l2==null?l1:l2;
                l2=new ListNode(0);
            }
            carry=l1.val+l2.val+carry;
            l.next=new ListNode(carry%10);
            carry=carry/10;
            l=l.next;
            l1=l1.next;
            l2=l2.next;
        }
        l.next=carry==0?null:new ListNode(carry%10);
        return hNode;
    }


    ListNode generateNode(int[] arr){
        ListNode l=new ListNode(arr[0]);
        ListNode ne=null;
        if(arr.length>1){
            ne=l.next;
        }
        for(int i=1;i<arr.length;i++){
            ne.next=new ListNode(arr[2]);
            ne=ne.next;
        }
        return l;
    }

//    int[] changeNodeToArray(ListNode l){
//        String
//
//    }

    long getNum(ListNode l){
        System.out.println(l.val+"****");
        if(l.next==null)
            return l.val;
        else return (long)(getNum(l.next)*10)+l.val;
    }

    ListNode generateNodeByNum(long x){
        ListNode l=new ListNode((int)(x%10));
        ListNode ne=l;
        x=x/10;
        while (x>0){
            ne.next=new ListNode((int)(x%10));
            ne=ne.next;
            x=x/10;
        }
        return l;
    }
    public static void main(String []args) {
        AddTwoNumber add = new AddTwoNumber();
        ListNode res = add.addTwoNumbers(add.generateNodeByNum(5), add.generateNodeByNum(5));
        ListNode l1 = add.generateNodeByNum(123);
        System.out.println(l1.val + "  " + add.getNum(res) + "  ");
        System.out.println();
    }
}
/**
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

