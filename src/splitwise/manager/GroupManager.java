package splitwise.manager;

import splitwise.constants.SplitType;
import splitwise.model.Expense;
import splitwise.model.Group;
import splitwise.model.Split;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {
    private final List<Group> groups;
    private final UserManager userManager;
    private final ExpenseManager expenseManager;

    public GroupManager(UserManager userManager, ExpenseManager expenseManager) {
        this.userManager = userManager;
        this.expenseManager = expenseManager;
        this.groups = new ArrayList<>();
    }

    public String createGroup(String groupId, String creatorId) {
        if (userManager.getUserById(creatorId) == null) {
            throw new IllegalArgumentException("Creator does not exist");
        }

        Group group = new Group(groupId, creatorId);
        groups.add(group);
        userManager.getUserById(creatorId).addGroupId(groupId);
        group.addMember(creatorId);
        return group.getGroupId();
    }

    public Group getGroupById(String groupId) {
        for (Group group : groups) {
            if (group.getGroupId().equals(groupId)) {
                return group;
            }
        }
        return null;
    }

    public void addMembersToGroup(String groupId, List<String> memberIds) {
        Group group = getGroupById(groupId);
        if (group == null) {
            throw new IllegalArgumentException("Group does not exist");
        }

        for (String memberId : memberIds) {
            if (userManager.getUserById(memberId) != null) {
                group.addMember(memberId);
                userManager.getUserById(memberId).addGroupId(groupId);
            } else {
                throw new IllegalArgumentException("User " + memberId + " does not exist");
            }
        }
    }

    public void removeMembersFromGroup(String groupId, List<String> memberIds) {
        Group group = getGroupById(groupId);
        if (group == null) {
            throw new IllegalArgumentException("Group does not exist");
        }

        for (String memberId : memberIds) {
            group.removeMember(memberId);
        }
    }

    public void createExpenseForGroup(final String userId, final String groupId, final double amount){
        Group group = getGroupById(groupId);
        if (group == null) {
            throw new IllegalArgumentException("Group does not exist");
        }

        if (!group.getMembers().contains(userId)) {
            throw new IllegalArgumentException("User is not a member of the group");
        }

        // Call the method to create an expense for the user in the group
        Expense expense =  expenseManager.createExpenseForUser(userId, groupId, amount, "Group Expense", SplitType.EQUAL, group.getMembers());
        final String paidBy = expense.getPaidBy();

        // Update the group balance sheet
        for (Split split : expense.getSplits()) {
            if (!split.getUserId().equals(paidBy)) {
                group.updateGroupBalanceSheet(paidBy, split.getUserId(), split.getAmount());
            }
        }
    }

    public void showGroupDashboard(String groupId) {
        Group group = getGroupById(groupId);
        if (group != null) {
            group.showGroupBalanceSheet();
        } else {
            System.out.println("Group not found.");
        }
    }

    public void settleGroupExpenses(String userId, String withUserId, String groupId) {
        Group group = getGroupById(groupId);
        if (group == null) {
            throw new IllegalArgumentException("Group does not exist");
        }

        if (!group.getMembers().contains(userId)) {
            throw new IllegalArgumentException("User is not a member of the group");
        }

        // Settle expenses logic can be implemented here
        // For now, just print the balances
        group.settleGroupBalance(userId, withUserId);
    }
}
