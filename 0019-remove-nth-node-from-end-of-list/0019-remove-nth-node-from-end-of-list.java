class Solution 
{
    public static ListNode Reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode crr=head;
        while(crr !=null)
        {
            ListNode temp=crr.next;
            crr.next=prev;
            prev=crr;
            crr=temp;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp=Reverse(head);
        ListNode head1=temp;
        int cnt=1;
        if(n==1)
        {
            return Reverse(head1.next);
        }
        while(temp !=null)
        {
            cnt++;
            if(cnt==n )
            {
                if(temp.next.next == null)
                {
                    temp.next=null;
                }
                else
                {
                    temp.next=temp.next.next;
                }
                break;
            }
            temp=temp.next;
        }
        return Reverse(head1);      
    }
}