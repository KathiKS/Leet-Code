class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }
        curr = head;
        int size = stack.size();
        for (int i = 0; i < size / 2; i++) {
            ListNode next = curr.next;
            ListNode last = stack.pop();
            curr.next = last;
            last.next = next;
            curr = next;
        }
        curr.next = null;
    }
}