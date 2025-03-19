package StructuralPatterns.Bridge;

// ConcreteImplementorA.java
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Конкретна реалізація A");
    }
}
