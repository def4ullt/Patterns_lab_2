import CreationalPatterns.Abstract_factory.*;
import CreationalPatterns.Builder.Computer;
import CreationalPatterns.Factory_method.ConcreteCreatorA;
import CreationalPatterns.Factory_method.ConcreteCreatorB;
import CreationalPatterns.Factory_method.Creator;
import CreationalPatterns.Prototype.ConcretePrototype;
import CreationalPatterns.Singleton.Singleton;
import StructuralPatterns.Adapter.*;
import StructuralPatterns.Bridge.*;
import StructuralPatterns.Composite.*;
import StructuralPatterns.Decorator.*;
import StructuralPatterns.Decorator.Component;
import StructuralPatterns.Facade.*;
import StructuralPatterns.Flyweight.*;
import StructuralPatterns.Proxy.*;

public class main {
    public static void main(String[] args) {
        //Creational patterns
        //singleton
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        //Builder
        Computer computer = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .build();
        computer.display();

        //Factory method
        Creator creatorA = new ConcreteCreatorA();
        creatorA.doSomething();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.doSomething();

        //Abstract Factory
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.operationA();
        productB1.operationB();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        productA2.operationA();
        productB2.operationB();

        //Prototype
        ConcretePrototype prototype1 = new ConcretePrototype(1, "Prototype 1");
        ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();
        prototype2.setId(2);
        prototype2.setName("Prototype 2");

        prototype1.display();
        prototype2.display();
        //Creational patterns end

        //Structural pattern
        // Adapter
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        // Bridge
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementorA);
        abstraction.operation();

        // Composite
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Leaf());

        Composite subComposite = new Composite();
        subComposite.add(new Leaf());
        composite.add(subComposite);

        composite.operation();

        // Decorator
        Component component = new ConcreteComponent();
        Component decoratedComponent = new ConcreteDecoratorA(component);
        decoratedComponent.operation();

        Component doublyDecoratedComponent = new ConcreteDecoratorB(decoratedComponent);
        doublyDecoratedComponent.operation();

        Component extraDecoratedComponent = new ExtraDecorator(doublyDecoratedComponent);
        extraDecoratedComponent.operation();

        // Facade
        SubsystemA subsystemA = new ConcreteSubsystemA();
        SubsystemB subsystemB = new ConcreteSubsystemB();
        Facade facade = new Facade(subsystemA, subsystemB);
        facade.operation();

        // Flyweight
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight(1, "A");
        flyweight1.operation(10);

        Flyweight flyweight2 = factory.getFlyweight(2, "B");
        flyweight2.operation(20);

        Flyweight flyweight3 = factory.getFlyweight(1, "A"); // Using existing object
        flyweight3.operation(30);

        // Proxy
        Subject subjectA = new Proxy("A");
        subjectA.request();

        Subject subjectB = new Proxy("B");
        subjectB.request();
    }
}
