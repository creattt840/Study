package hot100;

import java.util.HashSet;

public class test12 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            this.val = x;
            next=null;
        }
    }
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();
        while (head!=null){
            if (!seen.add(head)){
                //此时表示出现重复的节点
                return true;
            }
            head=head.next;
        }
        return false;
    }
}
