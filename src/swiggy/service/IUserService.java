package swiggy.service;

import swiggy.model.User;

public interface IUserService {
    void registerUser(final User user);

    void deleteUser(String userId);
}
