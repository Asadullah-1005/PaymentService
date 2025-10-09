package com.Tulip_Tech.PaymentService.service;

import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;

public interface PaymentService {
    Long doPayment(CreatePaymentRequest createPaymentRequest);
}
