package com.Tulip_Tech.PaymentService.service;

import com.Tulip_Tech.PaymentService.entity.PaymentEntity;
import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;
import com.Tulip_Tech.PaymentService.model.domain.Payment;
import org.springframework.http.HttpStatusCode;

public interface PaymentService {
    Long doPayment(CreatePaymentRequest createPaymentRequest);

    Payment findPaymentByOrderId(Long id);


    Payment findById();
}