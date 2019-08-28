package leecode.t3;

import leecode.comm.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private ArrayList<Integer> o1 = new ArrayList<>();;
    private ArrayList<Integer> o2 = new ArrayList<>();;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyL1 = new ListNode(0);
        dummyL1.next = l1;
        ListNode dummyL2 = new ListNode(0);
        dummyL2.next = l2;
        nodeToNum(dummyL1, dummyL2);

        ListNode dummyResult = new ListNode(0);

        int addInt = 0;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode result = l2;

        while (temp1.next != null || addInt == 1){
            int temp = temp1.val + temp2.val;
            int addTemp;
            if(temp >= 10){
                addInt = 1;
                addTemp  = temp - 10;
            }else{
                addInt = 0;
                addTemp = temp;
            }

        }
        return null;
    }

    private void nodeToNum(ListNode l1, ListNode l2){
        while (l1.next != null){
            o1.add(l1.next.val);
            o2.add(l2.next.val);
            l1 = l1.next;
            l2 = l2.next;
        }
    }

    public static void main(String[] args) {
        ListNode temp1 = new ListNode(9);
        ListNode temp2 = new ListNode(6);
        temp1.next = temp2;
        ListNode temp3 = new ListNode(5);
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


