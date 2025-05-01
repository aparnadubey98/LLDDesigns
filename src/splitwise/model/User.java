package splitwise.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final UserDashboard userDashboard;
    private final Map<String, Double> balances;
    private final List<String> groupIds;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userDashboard = new UserDashboard(email, 0.0, 0.0, 0.0);
        this.balances = new HashMap<>();
        this.groupIds = new ArrayList<>();
    }

    public void addGroupId(String groupId) {
        this.groupIds.add(groupId);
    }

    public void removeGroupId(String groupId) {
        this.groupIds.remove(groupId);
    }

    public void updateUserDashboard() {
        double totalOwed = 0.0;
        double totalPaid = 0.0;
        double totalSettled = 0.0;

        for (Map.Entry<String, Double> entry : balances.entrySet()) {
            if (entry.getValue() <= 0) {
                totalPaid += entry.getValue();
            } else {
                totalOwed += Math.abs(entry.getValue());
            }
        }

        this.userDashboard.setTotalOwed(totalOwed);
        this.userDashboard.setTotalPaid(totalPaid);
        this.userDashboard.setTotalSettled(totalSettled);
    }

    public void updateBalance(String userId, double amount) {
        this.balances.put(userId, this.balances.getOrDefault(userId, 0.0) + amount);
        if(this.balances.containsKey(userId) && this.balances.get(userId) == 0) {
            this.balances.remove(userId);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDashboard getUserDashboard() {
        return userDashboard;
    }

    public Map<String, Double> getBalances() {
        return balances;
    }
}
