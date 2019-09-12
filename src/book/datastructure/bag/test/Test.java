package book.datastructure.bag.test;

import book.datastructure.bag.src.ArrayBag;
import book.datastructure.bag.src.IBag;

public class Test {
    public static void main(String[] args) {
        IBag<String> testBag = new ArrayBag<String>(3);
        testBag.add("2122");
        testBag.add("12313");
        testBag.add("2122");
        testBag.add("2122");


        System.out.println(testBag.toString());
    }
}
