package swiggy.service;

import swiggy.enums.PartnerStatus;
import swiggy.model.DeliveryPartner;
import swiggy.model.Order;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DeliveryPartnerService {
    final Queue<DeliveryPartner> deliveryPartnerQueue;
    final Map<String, DeliveryPartner> deliveryPartnerMap;

    public DeliveryPartnerService() {
        deliveryPartnerQueue = new ConcurrentLinkedQueue<>();
        deliveryPartnerMap = new ConcurrentHashMap<>();
    }

    public void addDeliveryPartner(DeliveryPartner deliveryPartner) {
        deliveryPartnerQueue.add(deliveryPartner);
        System.out.println("Delivery partner added: " + deliveryPartner);
    }

    public synchronized void assignOrderToDeliveryPartner(String orderId) {
        while (deliveryPartnerQueue.isEmpty()) {
            try {
                wait(); // Wait until a delivery partner is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        DeliveryPartner deliveryPartner = deliveryPartnerQueue.poll();
        if (deliveryPartner != null) {
            deliveryPartner.setStatus(PartnerStatus.BUSY);
            deliveryPartnerMap.put(orderId, deliveryPartner);
            System.out.println("Order " + orderId +
                    " assigned to delivery partner " + deliveryPartner.getPartnerId());
        } else {
            System.out.println("No available delivery partners.");
        }
    }

    public synchronized void completeOrder(Order order) {
        DeliveryPartner deliveryPartner = deliveryPartnerMap.get(order.getOrderId());
        if (deliveryPartner != null) {
            deliveryPartner.setStatus(PartnerStatus.AVAILABLE);
            deliveryPartnerQueue.add(deliveryPartner);
            System.out.println("Order " + order.getOrderId() +
                    " completed by delivery partner " + deliveryPartner.getPartnerId());
            notifyAll(); // Notify waiting threads that a delivery partner is available
        } else {
            System.out.println("No delivery partner found for order " + order.getOrderId());
        }
    }
}
