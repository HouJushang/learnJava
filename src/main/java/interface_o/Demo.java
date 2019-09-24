package interface_o;


import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person(15);
        Person p2 = new Person(18);
        Person[] arr = {p2, p1};
        Arrays.sort(arr);
        System.out.println(1);
    }
}
