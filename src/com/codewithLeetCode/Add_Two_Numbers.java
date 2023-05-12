package com.codewithLeetCode;

import java.util.List;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode();
        ListNode result = ans;
        int carry = 0;
        while(l1!=null && l2!=null)
        {
            int sum  = l1.val + l2.val;
            int value  = (sum + carry)%10;
            carry =  (sum+carry)/10;
            ListNode temp = new ListNode(value);
            ans.next = temp;
            ans = ans.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l2!=null)
        {
            int sum =  l1.val;
            int value  = (sum + carry)%10;
            carry = (sum+carry)/10;

            ListNode temp = new ListNode(value);
            ans.next = temp;
            ans = ans.next;


            l2 = l2.next;
        }

        while(l1!=null)
        {
           int sum =  l1.val;
           int value  = (sum + carry)%10;
           carry = (sum+carry)/10;

            ListNode temp = new ListNode(value);
            ans.next = temp;
            ans = ans.next;


            l1 = l1.next;
        }

        if(carry!=0){
            ListNode temp = new ListNode(carry);
            ans.next = temp;
        }

        return result.next;



  }
}
