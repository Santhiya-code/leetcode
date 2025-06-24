class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode sd=new ListNode(0);
        ListNode temp=head;
        ListNode node=sd;
        if(head==null || head.next==null){
           return head;
        }
       while(temp!=null && temp.next!=null){
           ListNode first=temp;
           ListNode second=temp.next;
           sd.next=second;
           first.next=second.next;
           second.next=first;
           sd=first;
           temp=first.next;
       }
       return node.next;

    }
}
