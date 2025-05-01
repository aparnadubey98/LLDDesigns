package designPatterns.templateMethodPattern;

public abstract class PaymentTemplate {
    public abstract void confirmPayment();
    public abstract void enterPaymentDetails();
    public abstract void selectPaymentMethod();

    public final void processPayment() {
        selectPaymentMethod();
        enterPaymentDetails();
        confirmPayment();
    }
}
