package lombok;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(1, "123");
        System.out.println(student.getId());
    }
}
