class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode head1 = new ListNode(0);
        head1.next = head;
        ListNode node = head1;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next; 
            }
        }
        return head1.next;
    }
}