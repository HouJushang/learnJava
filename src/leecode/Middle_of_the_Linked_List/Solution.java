package leecode.Middle_of_the_Linked_List;

import leecode.comm.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        double deepth = 0;
        while (temp != null){
            deepth++;
            temp = temp.next;
        }
        int index = (int) Math.ceil(((deepth + 1)/2));

        int tempIndex = -1;
        ListNode temp2 = head;
        while (tempIndex != index){
            temp2 = temp2.next;
            tempIndex++;
        }
        return temp2;
    }
}
