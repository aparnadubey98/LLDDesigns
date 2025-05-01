package splitwise.manager;

import splitwise.model.Split;

import java.util.List;

public interface SplitManager {
    List<Split> splitExpense(String userId, String expenseId, double amount, List<String> userIds);
}
