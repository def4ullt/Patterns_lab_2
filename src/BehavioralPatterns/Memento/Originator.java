package BehavioralPatterns.Memento;

class Originator {
    private String state;

    void setState(String state) {
        this.state = state;
    }

    Memento save() {
        return new Memento(state);
    }

    void restore(Memento m) {
        state = m.getState();
    }
}
