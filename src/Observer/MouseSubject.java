package Observer;

public interface MouseSubject {


    void addObserver(MouseObserver o);

    void notifyObservers_ME(String me);


}
