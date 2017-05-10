/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
            //l1 null+l2 not null or l1 l2 null
        } else if (l2 == null) {
            return l1;
            //l2 null nut l1 not null
        } else {
            //create two things
            //head is something that is sure
            ListNode head = new ListNode(0);
            ListNode headpointer = head;
            //keeps l1 l2 as such that waits me to point to
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    head.next = l1;
                    l1 = l1.next;
                    head = head.next;
                } else {
                    head.next = l2;
                    l2 = l2.next;
                    head = head.next;
                }
            }
            head.next = l1 == null? l2:l1;
            return headpointer.next;
        }
    }
}