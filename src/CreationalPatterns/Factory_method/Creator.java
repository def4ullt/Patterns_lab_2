package CreationalPatterns.Factory_method;

public abstract class Creator {
    public abstract Product createProduct();

    public void doSomething() {
        Product product = createProduct();
        product.operation();
    }
}
