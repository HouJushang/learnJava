package princlple.demeter.v1;

import java.util.ArrayList;
import java.util.List;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 10; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourse(courseList);
    }
}
