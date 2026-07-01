

class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        ListNode temp=null;
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
        return temp;
    }
}
