package disignPatternHeadFirst.strategyPatten;

import disignPatternHeadFirst.strategyPatten.behavior.FlyNoWay;
import disignPatternHeadFirst.strategyPatten.behavior.Quack;

/**
 * 野鸭
 * 外观是绿头
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("我是MallardDuck绿头");
    }
}
