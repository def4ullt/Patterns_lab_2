package StructuralPatterns.Proxy;

// RealSubjectB.java
class RealSubjectB implements Subject {
    @Override
    public void request() {
        System.out.println("Реальний суб'єкт B: обробка запиту.");
    }
}
