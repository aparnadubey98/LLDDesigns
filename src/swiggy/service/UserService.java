package swiggy.service;

import swiggy.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements IUserService {
    final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void registerUser(final User user) {
        users.add(user);
        System.out.println("User registered: " + user);
    }

    @Override
    public void deleteUser(String userId) {
        users.removeIf(user -> user.getUserId().equals(userId));
        System.out.println("User deleted with ID: " + userId);
    }
}
