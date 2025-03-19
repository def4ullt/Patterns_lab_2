package StructuralPatterns.Decorator;

// ConcreteDecoratorA.java
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Конкретний декоратор A");
    }
}
