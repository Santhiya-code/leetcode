/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp1=headB;
        int count=0;
        int co=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        while(temp1!=null){
            co++;
            temp1=temp1.next;
        }
        if(count>co){
            int coo=count-co;
            ListNode aa=headA;
            for(int i=0;i<coo;i++){
               aa=aa.next;
            }
            ListNode bb=headB;
            while(aa!=null && bb!=null){
              if(aa==bb){
                return aa;
              }
              bb=bb.next;
              aa=aa.next;
            }
        }
          else if(co>count){
            int coo=co-count;
            ListNode aa=headB;
            for(int i=0;i<coo;i++){
               aa=aa.next;
            }
            ListNode bb=headA;
            while(aa!=null && bb!=null){
              if(aa==bb){
                return aa;
              }
              bb=bb.next;
              aa=aa.next;
            }
        }
        ListNode aa=headA;
        ListNode bb=headB;
        while(aa!=null && bb!=null){
              if(aa==bb){
                return aa;
              }
              aa=aa.next;
              bb=bb.next;
        }
        return null;
    }
}