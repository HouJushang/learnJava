package disignPatternHeadFirst.strategyPatten.behavior;

public class QuackMute implements QuackBehavior {
    public void quack() {
        System.out.println("我不会叫");
    }
}
