package StructuralPatterns.Flyweight;

// ConcreteFlyweightA.java
class ConcreteFlyweightA implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweightA(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("Легковаговик A: внутрішній стан = " + intrinsicState + ", зовнішній стан = " + extrinsicState);
    }
}
