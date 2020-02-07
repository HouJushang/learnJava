package disignPatternHeadFirst.observer.jdkObserver;

import java.util.Observable;

public class WeatherData extends Observable {

    private int temperature;

    public void measurementsChanged(int temperature){
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }

    public int getTemperature() {
        return temperature;
    }
}
