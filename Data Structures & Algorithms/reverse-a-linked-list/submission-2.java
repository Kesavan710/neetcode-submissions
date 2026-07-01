

class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        /*ListNode temp=null;
        if(head==null)
            return null;
        ListNode node=head;
        if(node.next==null)
        {
            return node;
        }

        temp=reverseList(node.next);
        node.next.next=node;
        node.next=null;
        return temp;*/

        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
