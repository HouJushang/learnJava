package disignPatternHeadFirst.strategyPatten;

public class Test {
    public static void main(String[] args) {
        Duck mallarDuck = new MallardDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();
    }
}
