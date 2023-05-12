package com.codewithLeetCode;
class ListNode2 {
     int val;
      ListNode2 next;
     ListNode2() {}
     ListNode2(int val)
     {
         this.val = val;
     }
    ListNode2(int val, ListNode2 next)
    {
        this.val = val;
        this.next = next;

    }
  }
public class Middle_of_the_Linked_List {

    public ListNode2 middleNode(ListNode2 head) {
if(head==null){
    return null;
}
ListNode2 slow  = head;
ListNode2 fast  = head;

while(fast.next != null && fast.next.next!=null)
{
    slow  = slow.next;
    fast = fast.next.next;
}
if(fast.next==null)
{
    return slow;
}
else{
    return slow.next;
}

    }
    public static void main(String[] args) {

    }
}
