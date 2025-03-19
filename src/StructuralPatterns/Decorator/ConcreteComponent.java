package StructuralPatterns.Decorator;

// ConcreteComponent.java
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Конкретний компонент");
    }
}
