package swiggy.service;

import swiggy.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private final List<Restaurant> restaurants;

    public RestaurantService() {
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
        System.out.println("Restaurant added: " + restaurant);
    }

    public void removeRestaurant(String restaurantId) {
        restaurants.removeIf(restaurant -> restaurant.getId().equals(restaurantId));
        System.out.println("Restaurant removed with ID: " + restaurantId);
    }

    public List<Restaurant> getRestaurants() {
        return new ArrayList<>(restaurants);
    }
}
