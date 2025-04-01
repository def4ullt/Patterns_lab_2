package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher{
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
