package com.codewithLeetCode;

public class Linked_List_Cycle_II {
    public ListNode1 detectCycle(ListNode1 head) {
        if(head==null)
        {
            return null;
        }
        ListNode1 slow  = head;
        ListNode1 fast  = head;
int count  = 0;
        while(slow!=null || fast!=null || fast!=slow)
        {
            slow = slow.next;
            if(fast.next ==null)
            {
                return null;
            }
            fast = fast.next.next;

            if(slow==fast)
            {
               break;
            }


        }

        ListNode1 f1 = head;
        ListNode1 f2 = slow;

        while(head!=slow )
        {
            head = head.next;
            slow  = slow.next;
        }


        return f2;
    }
    public static void main(String[] args) {

    }
}
