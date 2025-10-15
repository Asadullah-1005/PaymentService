package com.Tulip_Tech.PaymentService.entity;

import com.Tulip_Tech.PaymentService.model.Payment_Mode;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "PAYMENT")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEntity {


    @Id
    @GeneratedValue
    @Column(name = "payment_id")
    private Long id;

    @Setter
    @Column(name = "order_id")
    private Long orderId;

    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "payment_mode")
    private Payment_Mode paymentMode;

    @Setter
    @Column(name = "reference_number")
    private String referenceNumber;

    @Setter
    @Column(name = "payment_date")
    private Instant paymentDate;

    @Setter
    @Column(name = "payment_status")
    private String paymentStatus;

    @Setter
    @Column(name = "amount")
    private Long amount;
}
