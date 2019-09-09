package designPattern.princlple.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习JAVA");
    }
}
