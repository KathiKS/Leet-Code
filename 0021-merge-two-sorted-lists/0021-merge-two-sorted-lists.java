class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode secound = list2;
        ListNode dummy = new ListNode (-1);
        ListNode dummy1 = dummy;

        while(first !=null && secound != null)
        {
            if(first.val>secound.val )
            {
                dummy.next = new ListNode(secound.val);
                dummy = dummy.next;
                secound = secound.next;
            }
            else 
            {
                dummy.next = new ListNode(first.val);
                dummy = dummy.next;
                first = first.next;
            }
        }
        if(first != null)
        {
            dummy.next = first;
        }
        else
        {
            dummy.next = secound;
        }
        return dummy1.next;
    }
}