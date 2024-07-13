package Observer;

import java.util.ArrayList;

public abstract class KeySubject {
    ArrayList<KeyObserver> observers = new ArrayList<>();


    public void addObserver(KeyObserver o) {
        observers.add(o);
    }

    void removeObserver() {
        //
    }

    public void notifyObservers_KE(String ke) {
        for (KeyObserver o : observers) {
            o.processKeyEvent(ke);
        }
    }





}


