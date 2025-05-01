package splitwise.manager;

import splitwise.constants.SplitType;
import splitwise.model.Expense;
import splitwise.model.Split;
import splitwise.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private final List<User> users;
    private final ExpenseManager expenseManager;

    public UserManager(ExpenseManager expenseManager) {
        this.expenseManager = expenseManager;
        this.users = new ArrayList<>();
    }

    public void addUser(String name, String email, String phone) {
        User user = new User(name, email, phone);
        users.add(user);
    }

    public void createExpenseForUser(String userId, String groupId, double amount, String description, SplitType splitType, List<String> userIds) {
        Expense expense = expenseManager.createExpenseForUser(userId, groupId, amount, description, splitType, userIds);
        if (expense != null) {
            updateBalanceForAllUsers(expense);
        } else {
            System.out.println("Expense creation failed.");
        }
    }

    public void settleExpenses(String userId, String withUserId) {
        User user = getUserById(userId);
        User withUser = getUserById(withUserId);

        if (user != null && withUser != null) {
            double amountToSettle = user.getUserDashboard().getTotalOwed();
            user.updateBalance(withUserId, -amountToSettle);
            withUser.updateBalance(userId, amountToSettle);
            System.out.println("Settled " + amountToSettle + " between " + user.getName() + " and " + withUser.getName());
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public User getUserById(String userId) {
        for (User user : users) {
            if (user.getEmail().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    private void updateBalanceForAllUsers(final Expense expense) {
        List<Split> splits = expense.getSplits();
        User paidByUser = getUserById(expense.getPaidBy());

        if (paidByUser == null)
            return;

        for(Split split : splits){
            User user = getUserById(split.getUserId());
            if(!split.getUserId().equals(paidByUser.getEmail())){
                if(user != null){
                    user.updateBalance(expense.getPaidBy(), split.getAmount() * -1);
                    paidByUser.updateBalance(split.getUserId(), split.getAmount());
                }
            }

            // Update the user dashboard
            assert user != null;
            user.updateUserDashboard();
        }
    }

    public void showDashboard(String userId) {
        User user = getUserById(userId);
        if (user != null) {
            System.out.println("User Dashboard for " + user.getName());
            System.out.println("Total Owed: " + user.getUserDashboard().getTotalOwed());
            System.out.println("Total Paid: " + user.getUserDashboard().getTotalPaid());
            System.out.println("Total Settled: " + user.getUserDashboard().getTotalSettled());
        } else {
            System.out.println("User not found.");
        }
    }
}
