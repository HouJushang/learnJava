package interface_o;

public class Person implements Comparable<Person>, SayInterface{
    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Person other) {
        return Integer.compare(age, other.age);
    }

    @Override
    public String say() {
        return "111";
    }
}
