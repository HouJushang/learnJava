package designPattern.princlple.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        FlyBrid flybrid = new FlyBrid();
        WalkBrid walkBrid = new WalkBrid();
        flybrid.mainMoveMode("大雁");
        walkBrid.mainMoveMode("鸵鸟");
    }
}
