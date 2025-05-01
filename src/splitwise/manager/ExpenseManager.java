package splitwise.manager;

import splitwise.constants.SplitType;
import splitwise.factory.SplitManagerFactory;
import splitwise.model.Expense;
import splitwise.model.Split;

import java.util.List;
import java.util.UUID;

public class ExpenseManager {
     public Expense createExpenseForUser(String userId, String groupId, double amount, String description,
                                         SplitType splitType, List<String> userIds) {
         // Create a new expense
         String expenseId = String.valueOf(UUID.randomUUID());
         Expense expense = new Expense(expenseId, userId, groupId, amount, description, splitType);

         // Split the expense
         SplitManager splitManager = SplitManagerFactory.EQUAL.createSplitManager();
         List<Split> splits = splitManager.splitExpense(userId, expenseId, amount, userIds);

         // Add splits to the expense
         for (Split split : splits) {
             expense.addSplit(split);
         }

         return expense;
     }
}
