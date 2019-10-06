package princlple.dependenceinversion;

public class Geely {
    public void studyCourse(ICourse iCourse){
        iCourse.studyCourse();
    }
}
