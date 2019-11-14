package designPattern.creational.factorymethod;

public class JSVideofactory implements VideoFactory {
    @Override
    public Video getVideo() {
        return new JSVideo();
    }
}
