package facebook.model;

public class Message {
    private final String messageId;
    private final String content;
    private final String senderId;
    private final long timestamp;

    public Message(String messageId, String content, String senderId, long timestamp) {
        this.messageId = messageId;
        this.content = content;
        this.senderId = senderId;
        this.timestamp = timestamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getContent() {
        return content;
    }

    public String getSenderId() {
        return senderId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
