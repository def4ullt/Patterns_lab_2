package BehavioralPatterns.Mediator;

class ConcreteMediator implements Mediator {
    private Colleague user1, user2;

    void setUsers(Colleague u1, Colleague u2) {
        user1 = u1;
        user2 = u2;
    }

    public void sendMessage(String msg, Colleague sender) {
        if (sender == user1) user2.receive(msg);
        else user1.receive(msg);
    }
}
