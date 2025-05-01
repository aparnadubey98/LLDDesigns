package swiggy.model;

import swiggy.enums.OrderStatus;
import swiggy.enums.PaymentStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private String userId;
    private String restaurantId;
    private List<OrderItem> itemList;
    private OrderStatus orderStatus;
    private double totalPrice;
    private PaymentStatus paymentStatus;
    private String deliveryPartnerId;
    private LocalDateTime orderTime;

    public Order(String orderId, String userId, String restaurantId, List<OrderItem> itemList, OrderStatus orderStatus,
                 double totalPrice, PaymentStatus paymentStatus, String deliveryPartnerId, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.itemList = itemList;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
        this.paymentStatus = paymentStatus;
        this.deliveryPartnerId = deliveryPartnerId;
        this.orderTime = orderTime;
    }

    public String getDeliveryPartnerId() {
        return deliveryPartnerId;
    }

    public void setDeliveryPartnerId(String deliveryPartnerId) {
        this.deliveryPartnerId = deliveryPartnerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
