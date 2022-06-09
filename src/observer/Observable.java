package observer;

public interface Observable {
    void subscribe(Observer observer);

    void notifyObservers();

    String getRequestedToy();
}
