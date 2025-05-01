package facebook.service;

import facebook.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostService {
    final Map<String, List<Post>> postsByUserId;

    public PostService() {
        this.postsByUserId = new HashMap<>();
    }

    public void createPost(String userId, String postId, String content) {
        final Post post = new Post(postId, content, userId, System.currentTimeMillis());
        postsByUserId.computeIfAbsent(userId, k -> new ArrayList<>()).add(post);
    }

    public void deletePost(String userId, String postId) {
        if (postsByUserId.containsKey(userId)) {
            List<Post> posts = postsByUserId.get(userId);
            posts.removeIf(post -> post.getPostId().equals(postId));
        }
    }

    public List<Post> getPostsByUserId(String userId) {
        return postsByUserId.getOrDefault(userId, new ArrayList<>());
    }
}
