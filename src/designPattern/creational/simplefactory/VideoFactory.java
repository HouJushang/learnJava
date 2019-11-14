package designPattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }
        if("js".equalsIgnoreCase(type)){
            return new JSVideo();
        }
        return null;
    }
}
