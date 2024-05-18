import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();


    void addObserver(Observer o) {
        observers.add(o);
    }
    void removeObserver() {
        //
    }

    void notifyObservers_KE(String ke) {
        for (Observer o : observers) {
            o.processKeyEvent(ke);
        }
    }
}


