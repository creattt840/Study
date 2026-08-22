package hot100;

public class test32 {
     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sortList(ListNode head) {
         return sortList(head,null);
    }

    public ListNode sortList(ListNode head,ListNode tail){
         if (head==null){
             return head;
         }
         if (head.next==tail){
             head.next=null;
             //单节点
             return head;
         }
         //快节点
         ListNode fast=head;
         //慢节点
         ListNode slow=head;
         //遍历快慢节点找到链表中点
         while (fast!=tail){
             slow=slow.next;
             fast=fast.next;
             if (fast!=tail){
                 fast=fast.next;
             }
         }
         ListNode mid=slow;
         //此时递归不断排序然后归并结果
         ListNode list1=sortList(head,mid);
         ListNode list2=sortList(mid,tail);
         ListNode sorted=merge(list1,list2);
         return sorted;
    }

    public ListNode merge(ListNode head1,ListNode head2){
         ListNode dummyHead=new ListNode(0);
         ListNode temp=dummyHead;
         ListNode temp1=head1;
         ListNode temp2=head2;
         while (temp1!=null&&temp2!=null){
             if (temp1.val<= temp2.val){
                 temp.next=temp1;
                 temp1=temp1.next;
             }else{
                 temp.next=temp2;
                 temp2=temp2.next;
             }
             temp=temp.next;
         }
         //判断左边或者右边是否多一个
        if (temp1!=null){
            temp.next=temp1;
        }else if(temp2!=null){
            temp.next=temp2;
        }
        return dummyHead.next;
    }
}
