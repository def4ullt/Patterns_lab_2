package StructuralPatterns.Decorator;

// ConcreteDecoratorB.java
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Конкретний декоратор B");
    }
}
