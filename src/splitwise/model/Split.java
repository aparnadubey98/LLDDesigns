package splitwise.model;

public class Split {
    private final String userId;
    private double amount;
    private final String expenseId;

    public Split(String userId, double amount, String expenseId) {
        this.userId = userId;
        this.amount = amount;
        this.expenseId = expenseId;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpenseId() {
        return expenseId;
    }
}
