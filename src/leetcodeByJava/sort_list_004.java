package leetcodeByJava;
public class sort_list_004 {
    public ListNode sortList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(mid.next);
        mid.next=null;
        ListNode right=sortList(head);
        return mergeSort(left,right);

    }
    private ListNode mergeSort(ListNode left, ListNode right) {
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        ListNode head=null;
        if(left.val>right.val){
            head =right;
            right=right.next;
        }else{
            head =left;
            left=left.next;
        }
        ListNode temp=head;
        while(right!=null && left!=null){
            if(left.val>right.val){
                temp.next=right;
                right=right.next;
            }else{
                temp.next=left;
                left=left.next;
            }
            temp=temp.next;
        }
        if(right!=null){
            temp.next=right;
        }
        if(left!=null){
            temp.next=left;
        }
        return head;

    }
    private ListNode getMid(ListNode head) {
        // TODO Auto-generated method stub
        ListNode tem=head.next;
        ListNode mid=head;
        while(tem!=null && tem.next!=null){
            mid =mid.next;
            tem=tem.next.next;
        }
        return mid;
    }
 class ListNode {
      int val;
     ListNode next;
     ListNode(int x) {
        val = x;
        next = null;
    }
 }

}
