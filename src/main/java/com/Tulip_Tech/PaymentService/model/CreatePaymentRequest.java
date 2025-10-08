package com.Tulip_Tech.PaymentService.model;

public record CreatePaymentRequest(Long orderId,
                                   Long amount,
                                   Payment_Mode paymentMode,
                                   String referenceNumber
                    ) {
}
