package leecode.Add_Two_Numbers;

import leecode.comm.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);


        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode tempNode = dummyNode;

        int addInt = 0;
        while (temp1 != null || temp2 != null){
            int tempInt1 = temp1 != null ? temp1.val : 0;
            int tempInt2 = temp2 != null ? temp2.val : 0;
            int tempInt = tempInt1 + tempInt2 + addInt;
            if(tempInt >= 10){
                tempInt = tempInt - 10;
                addInt = 1;
            }else{
                addInt = 0;
            }
            tempNode.next = new ListNode(tempInt);
            tempNode = tempNode.next;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        if(addInt == 1){
            tempNode.next = new ListNode(1);
        }


        return dummyNode.next;
    }

}


