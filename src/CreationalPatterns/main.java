package CreationalPatterns;

import CreationalPatterns.Abstract_factory.*;
import CreationalPatterns.Builder.Computer;
import CreationalPatterns.Factory_method.ConcreteCreatorA;
import CreationalPatterns.Factory_method.ConcreteCreatorB;
import CreationalPatterns.Factory_method.Creator;
import CreationalPatterns.Prototype.ConcretePrototype;
import CreationalPatterns.Singleton.Singleton;

public class main {
    public static void main(String[] args) {
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
    }
}
