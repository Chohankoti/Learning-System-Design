package Subsystems.Restaurant_Service;

public class RestaurantServiceImpl implements RestaurantService {

    @Override
    public boolean validateRestaurant(String restaurantId) {
        System.out.println("Validating restaurant: " + restaurantId);
        return true;
    }
}
