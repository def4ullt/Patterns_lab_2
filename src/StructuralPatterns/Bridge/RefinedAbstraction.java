package StructuralPatterns.Bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("Уточнена абстракція");
        implementor.operationImpl();
    }
}
