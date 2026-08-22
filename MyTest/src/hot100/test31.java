package hot100;

import java.util.HashMap;
import java.util.Map;

public class test31 {
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

    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
        Map<Node, Node> map = new HashMap<>();
        Node cur=head;
        //第一次遍历先创建映射节点到value中，原节点在key中
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        //第二次遍历，把映射节点连起来然后赋值
        while (cur!=null){
            Node clone=map.get(cur);
            clone.random=map.get(cur.random);
            clone.next=map.get(cur.next);
            cur=cur.next;
        }
        return map.get(head);
    }
}
