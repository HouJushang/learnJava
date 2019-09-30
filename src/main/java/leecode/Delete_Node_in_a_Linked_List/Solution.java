package leecode.Delete_Node_in_a_Linked_List;

import leecode.comm.ListNode;

import java.util.ArrayList;

class Solution {
    public void deleteNode(ListNode node) {
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode temp = dummy;
        while (temp.next != null){
            if(temp.next.val == node.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }
}