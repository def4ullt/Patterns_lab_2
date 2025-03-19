package StructuralPatterns.Composite;

// Leaf.java
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Лист");
    }
}
