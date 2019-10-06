package princlple.demeter.v2;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 10; i++) {
            courseList.add(new Course());
        }
        System.out.println(courseList.size());
    }
}
