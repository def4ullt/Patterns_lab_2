package BehavioralPatterns.Observer;

public class MessageSubscriber implements Observer {
    private String name;
    public MessageSubscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println("MessageSubscriber(" + this.name + ") :: " + message);
    }
}
