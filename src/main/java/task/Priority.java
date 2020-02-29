package task;

public enum Priority {

    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private String friendlyValue;

    Priority(String friendlyValue) {
        this.friendlyValue = friendlyValue;
    }

    public String getFriendlyValue() {
        return friendlyValue;
    }
}
