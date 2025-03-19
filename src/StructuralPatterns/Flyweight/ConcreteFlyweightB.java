package StructuralPatterns.Flyweight;

// ConcreteFlyweightB.java
class ConcreteFlyweightB implements Flyweight {
    private int intrinsicState;

    public ConcreteFlyweightB(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("Легковаговик B: внутрішній стан = " + intrinsicState + ", зовнішній стан = " + extrinsicState);
    }
}
