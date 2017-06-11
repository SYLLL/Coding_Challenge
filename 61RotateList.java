/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while (fast != null) {
            fast = fast.next;
            count++;
        }
        k %= count;
        fast = head;
        if (k == 0) {
            return head;
        }
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        ListNode temp = slow.next;
        fast.next = head;
        slow.next = null;
        return temp;
    }
}