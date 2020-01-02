package cookbook;

import java.util.StringTokenizer;

public class CookBookString {
    public static void main(String[] args) {
//        testSubString();
//        testSplit();
//        testStringTokennizer();
//        testStringTokennizer2();
    }


    public static void testSubString() {
        String demo = "Hello world";
        String demo2 = demo.substring(0);
        String demo3 = "Hello world";
        String demo4 = "aHello world".substring(1);
        System.out.println(demo2 == demo);
        System.out.println(demo2 == demo);
        System.out.println(demo3 == demo2);
        System.out.println(demo4 == demo);

        java.lang.String demo5 = demo.substring(0, 5);
        System.out.println(demo5);
    }

    public static void testSplit() {
        String demo = "Hello world of java";
        String[] demoArr = demo.split(" ");
        for (String s : demoArr) {
            System.out.println(s);
        }
    }

    public static void testStringTokennizer() {
        StringTokenizer demo = new StringTokenizer("Hello world of java");
        while (demo.hasMoreTokens()){
            System.out.println(demo.nextToken());
        }
    }
    public static void testStringTokennizer2() {
        StringTokenizer demo = new StringTokenizer("Hello, world|of java", ", |");
        while (demo.hasMoreTokens()){
            System.out.println(demo.nextToken());
        }
    }
}
