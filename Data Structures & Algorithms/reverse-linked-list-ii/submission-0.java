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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode temp1=temp;
        for(int i=1;i<left;i++)
            temp=temp.next;
        ListNode last=temp.next;
        ListNode prev=null;
        ListNode curr=temp.next;
        for(int i=0;i<right-left+1;i++)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        temp.next=prev;
        last.next=curr;
        
        return temp1.next;
    }
}