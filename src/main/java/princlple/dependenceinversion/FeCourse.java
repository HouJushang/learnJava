package princlple.dependenceinversion;

public class FeCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("学习前端");
    }
}
