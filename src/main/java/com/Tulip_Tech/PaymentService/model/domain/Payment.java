package com.Tulip_Tech.PaymentService.model.domain;

import com.Tulip_Tech.PaymentService.model.Payment_Mode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private Long orderId;
    private Payment_Mode paymentMode;
    private String referenceNumber;
    private Instant paymentDate;
    private String paymentStatus;
    private Long amount;
}
