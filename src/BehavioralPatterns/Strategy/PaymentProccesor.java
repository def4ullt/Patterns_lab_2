package BehavioralPatterns.Strategy;

public class PaymentProccesor {
    private PaymentStrategy paymentStrategy;
    public PaymentProccesor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void SetPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void Pay(int _amount)
    {
        this.paymentStrategy.pay(_amount);
    }
}
