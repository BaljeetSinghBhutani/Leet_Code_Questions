package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class SortListAgain {
    public ListNode sortList(ListNode head) {

if(head==null|| head.next==null){
    return head;
}
ListNode mid = middleNode(head);
ListNode newHead = mid.next;
mid.next = null;
ListNode l1 = sortList(head);
ListNode l2 = sortList(newHead);

return mergeTwoLists(l1, l2);

}
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        if (list1 == null && list2 != null) {
            return list2;
        }
        if (list2 == null && list1 != null) {
            return list1;
        }

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode ans = new ListNode();
        ListNode tail = ans;


        while (list1.next != null && list2.next != null) {

            if(list1.val<= list2.val) {

                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;

            }
            else {

                tail.next  = list2;
                list2 = list2.next;
                tail = tail.next;
            }

        }
        while (list1.next != null) {

            tail.next =list1;
            list1 = list1.next;
        }
        while (list2.next != null) {
            tail.next = list2;
            list2 = list2.next;
        }
        return ans.next;
    }


    public ListNode middleNode(ListNode head) {
        if(head ==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }

        ListNode slow  = head;
        ListNode fast  = head;

        while(fast.next!=null &&  fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

}
