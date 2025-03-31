package BehavioralPatterns.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String _cardNumber;
    private int _cvv;
    public CreditCardPayment(String cardNumber, int cvv) {
        this._cardNumber = cardNumber;
        this._cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Paying %d by credit card%n", amount);
    }
}
