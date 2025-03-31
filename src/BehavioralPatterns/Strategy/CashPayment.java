package BehavioralPatterns.Strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.printf("Paying %d by cash%n", amount);
    }
}
