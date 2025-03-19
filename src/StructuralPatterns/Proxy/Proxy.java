package StructuralPatterns.Proxy;

// Proxy.java
public class Proxy implements Subject {
    private Subject realSubject;
    private String type;

    public Proxy(String type) {
        this.type = type;
    }

    @Override
    public void request() {
        if (realSubject == null) {
            if (type.equals("A")) {
                realSubject = new RealSubjectA();
            } else if (type.equals("B")) {
                realSubject = new RealSubjectB();
            }
        }
        System.out.println("Проксі: обробка запиту.");
        realSubject.request();
    }
}
