package swiggy.model;

import swiggy.enums.RestaurantStatus;

import java.util.List;

public class Restaurant {
    private final String name;
    private final Location location;
    private final double rating;
    private final String id;
    private final List<MenuItem> menuItems;
    private final RestaurantStatus restaurantStatus;

    public Restaurant(String name, Location location, double rating, String id, List<MenuItem> menuItems, RestaurantStatus restaurantStatus) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.id = id;
        this.menuItems = menuItems;
        this.restaurantStatus = restaurantStatus;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public Location getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public RestaurantStatus getRestaurantStatus() {
        return restaurantStatus;
    }
}
