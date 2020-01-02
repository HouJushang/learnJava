package datastructure.hashMap;

import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("123", 1222);
        map.put(123, 222);
        map.put(new Person("houjushang"), 1222);
        map.put(null, 222);
    }
    public static class Person {
        String name;
        public Person(String name) {
            this.name = name;
        }
    }
}
