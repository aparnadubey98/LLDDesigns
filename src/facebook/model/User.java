package facebook.model;

import facebook.constants.UserStatus;

public class User {
    private final String userId;
    private final String name;
    private final String email;
    private final String profilePictureUrl;
    private final UserStatus status;

    public User(String userId, String name, String email, String profilePictureUrl, UserStatus status) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.profilePictureUrl = profilePictureUrl;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public UserStatus getStatus() {
        return status;
    }
}
