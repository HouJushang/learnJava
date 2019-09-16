package temp.factoryMethod;

public class FeVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}
