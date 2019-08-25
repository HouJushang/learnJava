package leecode.t3;

import leecode.comm.ListNode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer num = nodeToNum(l1, 1) + nodeToNum(l2, 1);
        String numString = num.toString();

        ListNode startNode = new ListNode(Integer.parseInt(String.valueOf(numString.charAt(numString.length() - 1))));
        ListNode tempNode = startNode;
        for (int i = numString.length() - 2; i >= 0; i--) {
            tempNode.next= new ListNode(Integer.parseInt(String.valueOf(numString.charAt(i))));
            tempNode = tempNode.next;
        }
        return startNode;
    }

    private Integer nodeToNum(ListNode l, int ratio){
        int num = l.val * ratio;
        if(l.next != null){
            num += this.nodeToNum(l.next, ratio * 10);
        }
        return num;
    }

    public static void main(String[] args) {
        ListNode temp1 = new ListNode(9);
        ListNode temp2 = new ListNode(9);
        temp1.next = temp2;
        ListNode temp3 = new ListNode(9);
        temp2.next = temp3;
        ListNode temp4 = new ListNode(9);
        temp3.next = temp4;
        ListNode temp5 = new ListNode(9);
        temp4.next = temp5;
        ListNode temp6 = new ListNode(9);
        temp5.next = temp6;
        ListNode temp7 = new ListNode(9);
        temp6.next = temp7;
        ListNode temp8 = new ListNode(9);
        temp7.next = temp8;
        ListNode temp9 = new ListNode(9);
        temp8.next = temp9;
        ListNode temp10 = new ListNode(9);
        temp9.next = temp10;
        new Solution().addTwoNumbers(temp1, temp1);
    }


}


