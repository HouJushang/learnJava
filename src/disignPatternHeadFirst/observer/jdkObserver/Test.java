package disignPatternHeadFirst.observer.jdkObserver;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        Observer panel1 = new Panel("name1");
        Observer panel2 = new Panel("name2");
        Observer panel3 = new Panel("name3");
        observable.addObserver(panel1);
        observable.addObserver(panel2);
        observable.addObserver(panel3);
        observable.measurementsChanged(123);
    }
}
