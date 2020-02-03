package disignPatternHeadFirst.observer;

public class Test {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer panel1 = new Panel("name1");
        Observer panel2 = new Panel("name2");
        Observer panel3 = new Panel("name3");
        subject.registerObserver(panel1);
        subject.registerObserver(panel2);
        subject.registerObserver(panel3);

        subject.measurementsChanged(2);
    }
}
