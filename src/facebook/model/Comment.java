package facebook.model;

public class Comment {
    private final String commentId;
    private final String postId;
    private final String content;
    private final String authorId;
    private final long timestamp;

    public Comment(String commentId, String postId, String content, String authorId, long timestamp) {
        this.commentId = commentId;
        this.postId = postId;
        this.content = content;
        this.authorId = authorId;
        this.timestamp = timestamp;
    }

    public String getCommentId() {
        return commentId;
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
