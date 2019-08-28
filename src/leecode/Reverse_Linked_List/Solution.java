package leecode.Reverse_Linked_List;

import leecode.comm.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        return fn(head, null);
    }

    private ListNode fn(ListNode curr, ListNode target) {
        if(curr == null) return target;

        ListNode result = new ListNode(curr.val);
        result.next = target;
        return fn(curr.next, result);
    }
}
