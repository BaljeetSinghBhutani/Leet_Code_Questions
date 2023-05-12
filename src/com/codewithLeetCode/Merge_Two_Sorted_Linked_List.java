package com.codewithLeetCode;

import java.util.LinkedList;

public class Merge_Two_Sorted_Linked_List {

      public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
    ListNode(int val)
    {
        this.val = val;
    }
      ListNode(int val, ListNode next)
      {
          this.val = val; this.next = next;
      }
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

        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode h3 = list1;
        ListNode t3 = list1;
        int a = t1.val;
        int b = t2.val;
        if (a <= b) {
            t1 = t1.next;

            while (t1 != null && t2 != null) {
                a = t1.val;
                b = t2.val;
                if (b <= a) {
                    t3.next = t2;
                    t2 = t2.next;
                    t3 = t3.next;
                } else {
                    t3.next = t1;
                    t1 = t1.next;
                    t3 = t3.next;
                }


            }


            if (t1 == null && t2 != null) {
                t3.next = t2;


            }
            if (t2 == null && t1 != null) {
                t3.next = t1;

            }
        }

        else{
            t3 = list2;
            h3 = list2;

            t2 = t2.next;
            while (t1 != null && t2 != null) {
                a = t1.val;
                b = t2.val;
                if (b <= a) {
                    t3.next = t2;
                    t2 = t2.next;
                    t3 = t3.next;
                } else {
                    t3.next = t1;
                    t1 = t1.next;
                    t3 = t3.next;
                }


            }


            if (t1 == null && t2 != null) {
                t3.next = t2;


            }
            if (t2 == null && t1 != null) {
                t3.next = t1;

            }

        }

return h3;
    }
    public static void main(String[] args) {

    }
}
