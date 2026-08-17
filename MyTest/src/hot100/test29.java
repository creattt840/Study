package hot100;

import java.util.HashSet;
import java.util.Set;

public class test29 {
    public static void main(String[] args) {

    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode detectCycle(ListNode head) {
        //用pos来记录遍历节点
        ListNode pos=head;
        //创建Set集合来记录保存已经访问过的节点
        Set<ListNode> visited = new HashSet<>();
        //遍历链表
        while (pos!=null){
            if (visited.contains(pos)){
                return pos;
            }else{
                visited.add(pos);
            }
            pos=pos.next;
        }
        return null;
    }
}
