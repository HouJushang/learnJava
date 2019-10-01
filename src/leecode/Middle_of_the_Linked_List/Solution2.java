package leecode.Middle_of_the_Linked_List;

import leecode.comm.ListNode;

public class Solution2 {
    public ListNode middleNode(ListNode head, int val) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


