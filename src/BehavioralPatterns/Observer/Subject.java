package BehavioralPatterns.Observer;
import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) {
        observers.add(o);
    }

    void notifyObservers(String msg) {
        observers.forEach(o -> o.update(msg));
    }
}
