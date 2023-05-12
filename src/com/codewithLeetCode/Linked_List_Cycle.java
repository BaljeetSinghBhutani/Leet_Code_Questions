package com.codewithLeetCode;
class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1(int x) {
          val = x;
          next = null;
      }
  }
public class Linked_List_Cycle {

    public boolean hasCycle(ListNode1 head) {
        if(head==null)
        {
            return false;
        }
ListNode1 slow  = head;
ListNode1 fast  = head;

while(slow!=null || fast!=null || fast!=slow)
{
    if(slow==null || fast ==null)
    {
        return false;
    }

    slow = slow.next;
    fast = fast.next.next;

    if(slow==fast)
    {
        return true;
    }
}

return true;
    }
    public static void main(String[] args) {

    }
}
