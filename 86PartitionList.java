/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast.next != null) {
            //insert case
            if (fast.next.val < x) {
                //insert to fast's front case
                if (fast == slow) {
                    fast = fast.next;
                    slow = slow.next;
                //insert to fast's back case
                } else {
                    fast = this.insert(slow, fast);
                    slow = slow.next;
                }
            //not insert case
            } else {
                fast = fast.next;
            }
        }
        return dummy.next;
    }
    
    //inserts fast.next into slow.next
    //returns slow's new position
    public ListNode insert(ListNode slow, ListNode fast) {
        ListNode temp = fast.next;
        fast.next = temp.next;
        temp.next = slow.next;
        slow.next = temp;
        return fast;
    }
}