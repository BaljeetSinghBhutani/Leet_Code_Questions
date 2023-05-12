package com.codewithLeetCode;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
     ListNode() {

     }
    ListNode(int val) {
         this.val = val;
     }
     ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
  }
public class Merge_Two_Sorted_Lists {



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


    public static void main(String[] args) {

    }
}
