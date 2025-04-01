package BehavioralPatterns.Mediator;

public class User {
    private String name;
    private ChatRoom mediator;

    public User(String name, ChatRoom mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public void send(String message){
        mediator.showMessage(this, message);
    }
}
