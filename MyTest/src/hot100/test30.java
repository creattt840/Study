package hot100;

public class test30 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        if (head==null||head.next==null){
            return head;
        }
        ListNode left=head;
        ListNode right=head.next;
        while (right.next!=null){
            ListNode temp=left;
            left.next=right.next;
            right.next=temp;
            left=left.next;
            right=right.next;
        }
        return head;
    }
}
