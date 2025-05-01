package swiggy.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import swiggy.enums.PaymentMethod;
import swiggy.enums.PaymentStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String paymentId;
    private String orderId;
    private PaymentMethod paymentMethod;
    private double amount;
    private PaymentStatus status;
    private LocalDateTime timestamp;
}
