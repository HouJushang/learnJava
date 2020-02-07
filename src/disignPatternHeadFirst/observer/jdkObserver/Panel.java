package disignPatternHeadFirst.observer.jdkObserver;


import java.util.Observable;
import java.util.Observer;

public class Panel implements Observer {
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
            System.out.println(this.name);
            System.out.println(arg.toString());
    }
}
