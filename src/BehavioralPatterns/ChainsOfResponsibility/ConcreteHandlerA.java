package BehavioralPatterns.ChainsOfResponsibility;

class ConcreteHandlerA implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(String request) {
        if (request.equals("A")) System.out.println("Handled by A");
        else if (next != null) next.handle(request);
    }
}
