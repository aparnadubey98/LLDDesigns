package splitwise.constants;

public enum SplitType {
    EQUAL("EQUAL"),
    EXACT("EXACT"),
    PERCENTAGE("PERCENTAGE"),
    SHARE("SHARE");

    private final String type;

    SplitType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
