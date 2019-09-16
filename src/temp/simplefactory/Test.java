package temp.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video javaVideo = videoFactory.getVideo(JavaVideo.class);
        if(javaVideo == null){
            return;
        }
        javaVideo.produce();
    }
}
