package splitwise.manager;

import splitwise.model.Split;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitManager implements SplitManager{
    @Override
    public List<Split> splitExpense(String userId, String expenseId, double amount, List<String> userIds) {
        // Calculate the equal split amount
        double splitAmount = amount / userIds.size();

        // Create splits for each user
        List<Split> splits = new ArrayList<>();
        for (String id : userIds) {
            splits.add(new Split(id, splitAmount, expenseId));
        }

        // Add the user who paid the expense
        splits.add(new Split(userId, splitAmount, expenseId));

        return splits;
    }
}
