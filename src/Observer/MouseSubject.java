package Observer;

public interface MouseSubject {


    void addObserver(MouseObserver o);

    void notifyObservers_ME(String me, int x, int y);


}
