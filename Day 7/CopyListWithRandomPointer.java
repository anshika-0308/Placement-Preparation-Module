/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Node iter = head;
        Node front = head;
        while(iter!=null) {
            front = iter.next;
            Node copy = new Node(iter.val);
            iter.next = copy;
            copy.next = front;
            iter = front;
        }
        iter = head;
        while(iter != null) {
            if(iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        Node psudohead = new Node(0);
        Node copy = psudohead;
        while(iter!=null){
            front = iter.next.next;
            copy.next = iter.next;
            iter.next = front;
            copy = copy.next;
            iter = iter.next;
        }
        return psudohead.next;
    }
}
