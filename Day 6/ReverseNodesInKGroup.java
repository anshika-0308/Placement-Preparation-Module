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
class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) {
            return head;
        }
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode pre = dum, cur = dum, nex = dum;
        int count=0;
        while(cur.next!=null){
            cur=cur.next;
            count++;
        }
        while(count>=k) {
            cur = pre.next;
            nex = cur.next;
            for(int i=1;i<k;i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            count -= k;
        }
        return dum.next;
    }
}
