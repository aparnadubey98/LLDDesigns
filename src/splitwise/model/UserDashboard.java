package splitwise.model;

import lombok.Setter;

public class UserDashboard {
    private final String userId;
    private double totalOwed;
    private double totalPaid;
    private double totalSettled;

    public UserDashboard(String userId, double totalOwed, double totalPaid, double totalSettled) {
        this.userId = userId;
        this.totalOwed = totalOwed;
        this.totalPaid = totalPaid;
        this.totalSettled = totalSettled;
    }

    public String getUserId() {
        return userId;
    }

    public double getTotalOwed() {
        return totalOwed;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public double getTotalSettled() {
        return totalSettled;
    }

    public void setTotalOwed(double totalOwed) {
        this.totalOwed = totalOwed;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public void setTotalSettled(double totalSettled) {
        this.totalSettled = totalSettled;
    }
}
