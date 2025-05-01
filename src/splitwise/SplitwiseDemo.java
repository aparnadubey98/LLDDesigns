package splitwise;

import splitwise.constants.SplitType;
import splitwise.manager.ExpenseManager;
import splitwise.manager.GroupManager;
import splitwise.manager.UserManager;

import java.util.List;

public class SplitwiseDemo {
    public static void main(String[] args) {
        final ExpenseManager expenseManager = new ExpenseManager();
        final UserManager userManager = new UserManager(expenseManager);

        // Adding users
        userManager.addUser("Aparna", "aparna@gmail.com", "1234567890");
        userManager.addUser("Ayush", "ayush@gmail.com", "0987654321");
        userManager.addUser("Ravi", "ravi@gmail.com", "1122334455");
        userManager.addUser("Vibhu", "vibhu@gmail.com", "2233445566");

        // Creating an expense
        userManager.createExpenseForUser("aparna@gmail.com", "group1", 120.0, "Dinner", SplitType.EQUAL,
                List.of("ayush@gmail.com", "ravi@gmail.com", "aparna@gmail.com"));

        // Show dashboard for a user
        userManager.showDashboard("aparna@gmail.com");

        final GroupManager groupManager = new GroupManager(userManager, expenseManager);
        // Creating a group
        String groupId = groupManager.createGroup("group1", "aparna@gmail.com");
        groupManager.addMembersToGroup(groupId, List.of("ayush@gmail.com", "vibhu@gmail.com"));

        groupManager.createExpenseForGroup("aparna@gmail.com", groupId, 200.0);
        groupManager.showGroupDashboard(groupId);
    }
}
