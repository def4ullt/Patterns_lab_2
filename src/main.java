import BehavioralPatterns.Command.*;
import BehavioralPatterns.Strategy.*;
import BehavioralPatterns.TemplateMethod.*;
import BehavioralPatterns.Observer.*;
import BehavioralPatterns.Iterator.*;
import BehavioralPatterns.Visitor.*;
import BehavioralPatterns.Mediator.*;
import BehavioralPatterns.ChainsOfResponsibility.*;
import BehavioralPatterns.Memento.*;
import BehavioralPatterns.State.*;
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
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
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

        //Behavioral
        //Strategy
        CashPayment ManyCashPayment = new CashPayment();
        PaymentProccesor Vasya = new PaymentProccesor(ManyCashPayment);
        Vasya.Pay(50);

        CreditCardPayment Vasyas_Card = new CreditCardPayment("5122-5345-4567-1245", 785);
        Vasya.SetPaymentStrategy(Vasyas_Card);
        Vasya.Pay(100);
        //Template method
        Game newGame = new csgo();
        Game afterLesson = new Pool();

        newGame.play();
        afterLesson.play();
        //Observer
        Observer ukrnet = new MessageSubscriber("ukrnet");
        Observer viber = new MessageSubscriber("viber");

        MessagePublisher phone = new MessagePublisher();

        phone.add(ukrnet);
        phone.add(viber);

        phone.setMessage("S VELIKODNEM!!!");

        //Iterator
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        //Command
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();

        //Visitor
        ComputerPart keyboard = new Keyboard();
        ComputerPart monitor = new Monitor();
        keyboard.accept(new ComputerPartDisplayVisitor());
        monitor.accept(new ComputerPartDisplayVisitor());

        //Mediator
        ChatRoom mediator = new ChatRoomImpl();
        User Stas = new User("Stas", mediator);
        User Dima = new User("Dima", mediator);
        Stas.send("Привіт, Діма!");
        Dima.send("Привіт, Стас!");

        //Chain of Responsibility
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "Це інформаційне повідомлення.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "Це повідомлення для налагодження.");
        loggerChain.logMessage(AbstractLogger.ERROR, "Це повідомлення про помилку.");

        //Memento
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("Стан #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Стан #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Стан #3");
        System.out.println("Поточний стан: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Другий збережений стан: " + originator.getState());

        //State
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
