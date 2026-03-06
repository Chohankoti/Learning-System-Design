public class Order {

    private String orderId;
    private String userEmail;
    private String phoneNumber;

    public Order(String orderId, String userEmail, String phoneNumber) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}