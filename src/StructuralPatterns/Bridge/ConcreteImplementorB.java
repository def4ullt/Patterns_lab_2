package StructuralPatterns.Bridge;

// ConcreteImplementorB.java
class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Конкретна реалізація B");
    }
}
