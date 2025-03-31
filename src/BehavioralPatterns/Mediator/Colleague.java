package BehavioralPatterns.Mediator;

abstract class Colleague {
    protected Mediator mediator;

    Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
