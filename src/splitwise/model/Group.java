package splitwise.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    @Getter
    private final String groupId;
    @Getter
    private final String creatorId;
    @Getter
    private final List<String> members;
    private final List<GroupBalanceSheet> groupBalanceSheets;

    public Group(String groupId, String creatorId) {
        this.groupId = groupId;
        this.creatorId = creatorId;
        members = new ArrayList<>();
        groupBalanceSheets = new ArrayList<>();
    }

    public void updateGroupBalanceSheet(String userId, String withUserId, double amount) {
        for (GroupBalanceSheet balanceSheet : groupBalanceSheets) {
            if (balanceSheet.getUserId().equals(userId) && balanceSheet.getWithUserId().equals(withUserId)) {
                balanceSheet.setAmount(balanceSheet.getAmount() + amount);
                return;
            }
        }
        groupBalanceSheets.add(new GroupBalanceSheet(userId, withUserId, amount));
    }

    public void settleGroupBalance(String userId, String withUserId) {
        for (GroupBalanceSheet balanceSheet : groupBalanceSheets) {
            if (balanceSheet.getUserId().equals(userId) && balanceSheet.getWithUserId().equals(withUserId)) {
                groupBalanceSheets.remove(balanceSheet);
                return;
            }
        }
    }

    public void showGroupBalanceSheet() {
        System.out.println("Group Balance Sheet for group " + groupId + ":");
        for (GroupBalanceSheet balanceSheet : groupBalanceSheets) {
            System.out.println("User: " + balanceSheet.getUserId() + ", With User: " + balanceSheet.getWithUserId() + ", Amount: " + balanceSheet.getAmount());
        }
    }

    public void simplifyBalances() {
        // Simplify balances logic can be implemented here
        // For now, just print the balances
        System.out.println("Simplified balances for group " + groupId + ":");
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        members.remove(member);
    }
}
