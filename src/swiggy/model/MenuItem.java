package swiggy.model;

public class MenuItem {
    private final String name;
    private final double price;
    private final String description;
    private final double rating;
    private final String id;

    public MenuItem(String name, double price, String description, double rating, String id) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }
}
