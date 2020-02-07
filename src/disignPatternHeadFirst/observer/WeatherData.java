package disignPatternHeadFirst.observer;


import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    private int temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int removeIndex = observers.indexOf(o);
        if(removeIndex >= 0){
            observers.remove(removeIndex);
        }
    }

    @Override
    public void notifyObservers(int temperature) {
        observers.forEach(observer -> observer.update(temperature));
    }

    public void measurementsChanged(int temperature){
        this.temperature = temperature;
        this.notifyObservers(temperature);
    }
}
