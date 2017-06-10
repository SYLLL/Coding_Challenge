/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //in order to remove first
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            //fast cannot be null
            fast = fast.next;
            if (fast == null) {
                return head;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //remove
        slow.next = slow.next.next;
        return dummy.next;
    }
}