package disignPatternHeadFirst.strategyPatten.behavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("普通呱呱叫");
    }
}
