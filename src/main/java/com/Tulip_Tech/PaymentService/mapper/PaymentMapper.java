package com.Tulip_Tech.PaymentService.mapper;

import com.Tulip_Tech.PaymentService.entity.PaymentEntity;
import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;
import com.Tulip_Tech.PaymentService.model.domain.Payment;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public PaymentEntity dtoToEntity(CreatePaymentRequest createPaymentRequest) {
        PaymentEntity paymentEntity = new PaymentEntity();
        BeanUtils.copyProperties(createPaymentRequest, paymentEntity);
        return paymentEntity;
    }

    public Payment entityToDomain(PaymentEntity paymentEntity) {
        Payment payment = new Payment();
        BeanUtils.copyProperties(paymentEntity, payment);
        return payment;
    }
}
