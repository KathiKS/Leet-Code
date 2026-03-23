class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        temp.next = head;
        k = k % length;
        int steps = length - k;

        while (steps-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;
        return head;
    }
}