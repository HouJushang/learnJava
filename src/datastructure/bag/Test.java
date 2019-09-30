package datastructure.bag;

import datastructure.bag.src.ArrayBag;
import datastructure.bag.src.IBag;

public class Test {
    public static void main(String[] args) {
        IBag aBag = new ArrayBag();
        String[] contentsOfBag1 = {"a", "a", "b", "a", "c", "a"};
        testAdd(aBag, contentsOfBag1);
        aBag.remove("a");
        dispalyBag(aBag);
    }

    private static void testAdd(IBag<String> aBag, String[] content){
        System.out.print("Adding the following " + content.length + " strings to the bag:");
        for (int i = 0; i < content.length; i++) {
            if(aBag.add(content[i])){
                System.out.print(content[i] + " ");
            }else {
                System.out.print("\nUNable to add " + content[i] + " to the bag.");
            }
        }
        System.out.println();
        dispalyBag(aBag);
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
