package StructuralPatterns.Proxy;

// RealSubjectA.java
class RealSubjectA implements Subject {
    @Override
    public void request() {
        System.out.println("Реальний суб'єкт A: обробка запиту.");
    }
}
