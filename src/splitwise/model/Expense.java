package splitwise.model;

import lombok.Getter;
import splitwise.constants.SplitType;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    private final String expenseId;
    private final String paidBy;
    private final String groupId;
    private final double amount;
    private final String description;
    private final SplitType splitType;
    private final List<Split> splits;

    public Expense(String expenseId, String userId, String groupId, double amount, String description, SplitType splitType) {
        this.expenseId = expenseId;
        this.paidBy = userId;
        this.groupId = groupId;
        this.amount = amount;
        this.description = description;
        this.splitType = splitType;
        this.splits = new ArrayList<>();
    }

    public void addSplit(Split split) {
        this.splits.add(split);
    }

    public List<Split> getSplits() {
        return splits;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public String getExpenseId() {
        return expenseId;
    }
}
