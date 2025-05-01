package facebook.model;

public class Post {
    private final String postId;
    private final String content;
    private final String authorId;
    private final long timestamp;

    public Post(String postId, String content, String authorId, long timestamp) {
        this.postId = postId;
        this.content = content;
        this.authorId = authorId;
        this.timestamp = timestamp;
    }

    public String getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorId() {
        return authorId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
