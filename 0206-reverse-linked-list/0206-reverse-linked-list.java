class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode dum = cur.next; 
            cur.next = prev;
            prev = cur;
            cur = dum;
        }

        return prev;
    }
}