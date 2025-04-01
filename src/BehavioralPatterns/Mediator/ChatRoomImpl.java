package BehavioralPatterns.Mediator;

import java.util.Date;

public class ChatRoomImpl implements ChatRoom {
    public void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
