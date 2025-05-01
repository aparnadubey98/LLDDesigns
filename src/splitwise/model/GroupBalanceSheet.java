package splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GroupBalanceSheet {
    private final String userId;
    private final String withUserId;
    private double amount;
}
