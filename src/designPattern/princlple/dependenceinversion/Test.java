package designPattern.princlple.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyCourse(new JavaCourse());
        geely.studyCourse(new FeCourse());
    }
}
