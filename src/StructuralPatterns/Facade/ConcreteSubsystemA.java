package StructuralPatterns.Facade;

// ConcreteSubsystemA.java
public class ConcreteSubsystemA implements SubsystemA {
    @Override
    public void operationA1() {
        System.out.println("Підсистема A: операція A1");
    }

    @Override
    public void operationA2() {
        System.out.println("Підсистема A: операція A2");
    }
}
