package swiggy.service;

import swiggy.enums.OrderStatus;
import swiggy.enums.PaymentStatus;
import swiggy.model.Order;
import swiggy.model.OrderItem;

import java.util.List;
import java.util.UUID;

public class OrderService {
    private final DeliveryPartnerService deliveryPartnerService;

    public OrderService(DeliveryPartnerService deliveryPartnerService) {
        this.deliveryPartnerService = deliveryPartnerService;
    }

    public String placeOrder(String itemId, String userId, String restaurantId, String totalPrice) {
//        final OrderItem orderItem = new OrderItem(
//                itemId,
//                1
//        );
//        final Order order = new Order(
//                "order" + UUID.randomUUID(),
//                userId,
//                restaurantId,
//                List.of(orderItem),
//                OrderStatus.ACCEPTED,
//                Double.parseDouble(totalPrice),
//                PaymentStatus.PENDING,
//                null,
//                null
//        );
//
//        deliveryPartnerService.assignOrderToDeliveryPartner(order);
        return "";
    }
}
