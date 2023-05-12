package com.codewithLeetCode;

import org.w3c.dom.ls.LSInput;

import java.util.List;

public class sortlist {
    public ListNode sortList(ListNode head) {

//        Selection sort

     if(head==null)
     {
         return head;
     }
     ListNode current  = head;
     ListNode itr  = head;
     while(current!=null)
     {
         ListNode minnode = itr;

         while(itr!=null)
         {
             if(itr.val<= minnode.val)
             {
                 itr  = minnode;
             }

         }
     }









//        Merge Sort
if(head ==null || head.next == null)
{
    return head;
}

ListNode mid  = middleNode(head);
ListNode left  = sortList(head);
ListNode right  = sortList(mid);

return mergeTwoLists(left, right);
    }


    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null) {
            return slow;
        } else {
            return slow.next;
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














//    ListNode getmid(ListNode head)
//    {
//        ListNode slow = head;
//        ListNode fast = head;
//        while(fast.next!=null && fast.next.next!=null)
//        {
//            fast = fast.next.next;
//            slow =  slow.next;
//
//        }
//
//      return slow;
//
//    }

//    ListNode merge(ListNode node1, ListNode node2)
//    {
//if(node1==null && node2 ==null)
//{
//    return null;
//}
//if(node1 == null  &&  node2!=null)
//{
//    return node2;
//}
//if(node1!=null && node2==null)
//{
//    return node1;
//}
//
//
//        ListNode temp1 =  node1;
//        ListNode temp2 =  node2;
//ListNode temp  = new ListNode();
//ListNode temp3  =  temp;
//        while(temp1!=null && temp2 !=null)
//        {
//if(temp1.val<=temp2.val)
//{
//   temp.next  = temp1;
//   temp1  =  temp1.next;
//   temp = temp.next;
//}
//else {
//    temp.next =  temp2;
//    temp2 =  temp2.next;
//    temp  = temp.next;
//}
//
//        }
//
//        if(temp1!=null)
//        {
//            temp.next =  temp1;
//
//        }   if(temp2!=null)
//        {
//            temp.next =  temp2;
//
//        }
//        return temp3.next;
//    }







}
