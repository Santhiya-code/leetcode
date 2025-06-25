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
    public ListNode removeElements(ListNode head, int val) {
        ListNode nn=new ListNode(0);
        ListNode temp=head;
        ListNode tempp=nn;
        while(temp!=null){
            if(temp.val!=val){
               tempp.next=temp;
               tempp=tempp.next;
            }
            temp=temp.next;
        }
        tempp.next=null;
        return nn.next;
    }
}