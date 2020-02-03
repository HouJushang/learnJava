package disignPatternHeadFirst.strategyPatten;

import disignPatternHeadFirst.strategyPatten.behavior.FlyBehavior;
import disignPatternHeadFirst.strategyPatten.behavior.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    void display(){};

    void performQuack() {
        quackBehavior.quack();
    };

    void performFly() {
        flyBehavior.fly();
    }
}
