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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length <= 0) return null;
        return merge(lists, 0, lists.length - 1);
    }
    public ListNode merge(ListNode[] lists, int low, int high) {
        if (low >= high) return lists[low];
        if (low + 1 == high) return mergeLists(lists[low], lists[high]);
        int mid = low + (high - low)/2;
        ListNode l1 = merge(lists, low, mid); ListNode l2 = merge(lists, mid + 1, high);
        return mergeLists(l1, l2);
    }
    public ListNode mergeLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2; 
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy; ListNode cur1 = l1; ListNode cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
                cur = cur.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
                cur = cur.next;
            }
        }
        if (cur1 != null) {
            cur.next = cur1;
        } 
        if (cur2 != null) {
            cur.next = cur2;
        }
        return dummy.next;
    }
}