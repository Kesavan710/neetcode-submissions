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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode slow=head;
        ListNode temp=head;
        int n=0;
        for(int i=0;i<k && temp!=null;i++){
            temp=temp.next;
            n++;
        }
        if(n==k)
        {
            ListNode prev=null;
            ListNode curr=slow;
            for(int i=0;i<k;i++)
            {
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head.next = reverseKGroup(temp, k);
            return prev;
        }
        return head;
        
    }
}
