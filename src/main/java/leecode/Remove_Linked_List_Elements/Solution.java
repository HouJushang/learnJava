package leecode.Remove_Linked_List_Elements;

import leecode.comm.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        return this.fn(head, val);
    }

    private ListNode fn(ListNode head, int val){
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode cur = head.next;

        if(pre.val == val){
            if(head.next != null){
                return fn(head.next, val);
            }
            return null;
        }else{
            while (cur != null ){
                if(cur.val == val){
                    pre.next = cur.next;
                    cur.next = null;
                    cur = pre.next;
                }else{
                    pre = cur;
                    cur = cur == null ? null : cur.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(6);
        ListNode temp2 = new ListNode(1);
        temp2.next = temp;
        ListNode temp3 = new ListNode(2);
        temp3.next = temp2;
        ListNode temp4 = new ListNode(6);
        temp4.next = temp3;
        ListNode temp5 = new ListNode(3);
        temp5.next = temp4;
        ListNode temp6 = new ListNode(6);
        temp6.next = temp5;

        ListNode result = new Solution().removeElements(temp6, 6);
        System.out.print(11111);
    }
}


