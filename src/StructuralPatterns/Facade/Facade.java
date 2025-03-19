package StructuralPatterns.Facade;

// Facade.java
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;

    public Facade(SubsystemA subsystemA, SubsystemB subsystemB) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
    }

    public void operation() {
        System.out.println("Фасад: операція");
        subsystemA.operationA1();
        subsystemB.operationB1();
    }
}
