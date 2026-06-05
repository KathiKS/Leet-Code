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
    public static ListNode reverse(ListNode node, int k) {
        if (node == null || k == 1) return node; // Base case

        int n = 0, m = 0;
        ListNode n1 = node, n2 = node;

        while (n1 != null && n++ < k) n1 = n1.next;
        if (n < k) return node;

        ListNode prev = reverse(n1, k);
        while (m++ < k) {
            ListNode temp = n2.next;
            n2.next = prev;
            prev = n2;
            n2 = temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverse(head, k);
    }
}