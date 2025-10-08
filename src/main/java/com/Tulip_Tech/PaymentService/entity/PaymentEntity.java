package com.Tulip_Tech.PaymentService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String paymentMode;

    @Setter
    private String referenceNumber;

    @Setter
    private Instant paymentDate;

    @Setter
    private String paymentStatus;

    @Setter
    private Double amount;
}
