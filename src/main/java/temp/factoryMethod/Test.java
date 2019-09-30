package temp.factoryMethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory javaVideoFactory1 = new JavaVideoFactory();
        VideoFactory javaVideoFactory2 = new PythonVideoFactory();
        VideoFactory javaVideoFactory3 = new FeVideoFactory();
        Video video1 = javaVideoFactory1.getVideo();
        Video video2 = javaVideoFactory2.getVideo();
        Video video3 = javaVideoFactory3.getVideo();
        video1.produce();
        video2.produce();
        video3.produce();
    }
}
