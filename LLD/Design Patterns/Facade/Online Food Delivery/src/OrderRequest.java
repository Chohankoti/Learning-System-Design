public class OrderRequest {
    private final String userId;
    private final String restaurantId;
    private final double amount;

    public OrderRequest(String userId, String restaurantId, double amount) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.amount = amount;
    }

    public String getUserId() { return userId; }
    public String getRestaurantId() { return restaurantId; }
    public double getAmount() { return amount; }
}