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
    public boolean isPalindrome(ListNode head) {
        ListNode l1=head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null ){
             slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        while(curr!=null){
            ListNode Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        ListNode temp1=prev;
        ListNode temp2=head;
        while(temp1!=null && temp2!=null){
        if(temp1.val!=temp2.val){
            return false;
        }
        temp1=temp1.next;
        temp2=temp2.next;
        }
        return true;
        
    }
}