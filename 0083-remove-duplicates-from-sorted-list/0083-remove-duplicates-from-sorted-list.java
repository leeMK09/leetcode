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
    public ListNode deleteDuplicates(ListNode head) {
        System.out.println(head);
        System.out.println(head.val);
        if (head.next == null) return head;

        ListNode prev = head;
        ListNode next = head.next;

        while (next != null) {
            int val = next.val;
            int prevVal = prev.val;
            
            if (prevVal == val) {
                prev.next = next.next;
            } else {
                prev = next;
            }
            
            next = next.next;
        }

        return head;
    }
}