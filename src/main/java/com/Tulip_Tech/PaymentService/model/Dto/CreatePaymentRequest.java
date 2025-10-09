package com.Tulip_Tech.PaymentService.model.Dto;

import com.Tulip_Tech.PaymentService.model.Payment_Mode;

public record CreatePaymentRequest(Long orderId,
                                   Long amount,
                                   Payment_Mode paymentMode,
                                   String referenceNumber
                    ) {
}
