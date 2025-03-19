package StructuralPatterns.Decorator;

// ExtraDecorator.java
public class ExtraDecorator extends Decorator {
    public ExtraDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Додатковий декоратор");
    }
}
