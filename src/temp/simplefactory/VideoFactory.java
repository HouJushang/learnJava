package temp.simplefactory;

public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;
        try {
            // 反射遵守开闭原则
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
