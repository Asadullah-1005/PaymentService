package com.Tulip_Tech.PaymentService.service;

import com.Tulip_Tech.PaymentService.model.CreatePaymentRequest;
import org.springframework.stereotype.Service;

public interface PaymentService {
    Long doPayment(CreatePaymentRequest createPaymentRequest);
}
