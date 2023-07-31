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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode NewHead = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = NewHead;
            NewHead = head;
            head = next;
        }
        return NewHead;
    }
}
