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
    private Long id;

    @Setter
    private Long orderId;

    @Setter
    @Enumerated(EnumType.STRING)
    private Payment_Mode paymentMode;

    @Setter
    private String referenceNumber;

    @Setter
    private Instant paymentDate;

    @Setter
    private String paymentStatus;

    @Setter
    private Long amount;
}
