package swiggy.model;

public class User {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final Address address;
    private final String userId;


    public User(String name, String email, String phoneNumber, Address address, String userId) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getUserId() {
        return userId;
    }
}
