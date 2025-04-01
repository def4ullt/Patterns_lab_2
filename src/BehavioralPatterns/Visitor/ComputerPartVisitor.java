package BehavioralPatterns.Visitor;

public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
