package datastructure.bag.test;

import datastructure.bag.src.IBag;
import datastructure.bag.src.LinkedBag;

public class LinkedBagDemo1 {
    public static void main(String[] args) {
        System.out.println("Creating an empty bag.");
        IBag aBag = new LinkedBag();
        testIsEmpty(aBag, true);
        dispalyBag(aBag);
    }

    private static  void testIsEmpty(IBag<String> bag, boolean empty) {
        System.out.print("Test isEmpty with ");
        if(empty)
            System.out.println("an empty bag");
        else
            System.out.println("a bag that is not empty");

        System.out.print("isEmpty finds the bag ");
        if(empty && bag.isEmpty())
            System.out.print("empty: OK ");
        else if(empty)
            System.out.println("not empty, but it is: ERROR");
        else if(!empty && bag.isEmpty())
            System.out.println("empty, but it is not empty: ERROR");
        else
            System.out.println("not empty: OK.");
    }

    private static void dispalyBag(IBag<String> aBag) {
        System.out.println("The bag contains the following string(s)");
        Object[] bagArray = aBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");
        }
        System.out.println();
    }
}
