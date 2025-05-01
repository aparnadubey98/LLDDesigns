package facebook.service;

import facebook.model.User;
import facebook.constants.UserStatus;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public void createUser(String userId, String name, String email, String profilePictureUrl) {
        final User user = new User(userId, name, email, profilePictureUrl, UserStatus.ONLINE);
        users.add(user);
    }

    public void removeUser(String userId) {
        users.removeIf(user -> user.getUserId().equals(userId));
    }

    public User getUser(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        throw new RuntimeException("User not found"); // User not found
    }
}
