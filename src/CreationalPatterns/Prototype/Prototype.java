package CreationalPatterns.Prototype;

public interface Prototype extends Cloneable {
    Prototype clone();
    void display();
}

