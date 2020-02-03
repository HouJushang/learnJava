package disignPatternHeadFirst.observer;

public class Panel implements Observer{
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(this.name + ":" + temperature);
    }
}
