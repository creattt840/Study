package hot100;

public class test28 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //创建一个用于记录头节点的节点
        ListNode dummy=new ListNode(0,head);
        //计算出总长度
        int length=getLength(head);
        ListNode cur=dummy;
        //遍历到待删除节点的上一个节点
        for (int i = 0; i < length - n; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        ListNode ans=dummy.next;
        return ans;
    }

    //计算链表的总长度
    public static int getLength(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
}
