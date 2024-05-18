import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();


    abstract void addObserver(Observer o);
    abstract void removeObserver();
    abstract void notifyObservers();

}
