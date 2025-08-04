/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int count=0;
       ListNode temp=head;
       while(temp!=null){
        count++;
        temp=temp.next;
       }
       if(count==n){
        return head.next;
       }
       ListNode tem=head;
       while(tem!=null && tem.next!=null){
          count--;
          if(count==n){
            tem.next=tem.next.next;
            return head;
          }
          tem=tem.next;
       }
       return head;
    }
}