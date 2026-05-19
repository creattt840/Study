package hot100;

public class test13 {

     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         //创建一个新的链表来存放相加后的数据，head记录头节点，tail为后续遍历节点
        ListNode head = null,tail=null;
        //这个为用来记录下一位是进1还是0
        int carry=0;
        while (l1!=null||l2!=null){
            //判断两个链表的节点是否为空
            int n1=l1!=null?l1.val : 0;
            int n2=l2!=null? l2.val : 0;
            int sum=n1+n2+carry;
            //判断新链表是否是头节点
            if (head==null) {
                //如果是头节点，初始化头节点
                head=tail=new ListNode(sum%10);
            }else {
                //如果不是头节点，加入新数据，tail指向下一个节点
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            //此时计算carry是0还是1
            carry=sum/10;
            //此时让l1和l2都指向下一个节点
            if (l1!=null) {
                l1=l1.next;
            }
            if (l2!=null) {
                l2=l2.next;
            }
        }
        //此时l1和l2都到节点末尾，判断是否carry是否为空
        if (carry>0) {
            tail.next=new ListNode(carry);
        }
        return head;
    }
}
