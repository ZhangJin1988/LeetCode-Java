package com.leetcode.twentyone.fourty;

/**
 *  Definition for singly-linked list.
 *
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @author zhangjin
 * @date 2020-05-11 10:16
 */
public class Twentyone {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        if(l1 == null){
            return l2;
        }

        if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){

            l1.next = mergeTwoLists(l1.next, l2);
            return l1;

        }else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }


//        return new ListNode(1);
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
