package com.Tulip_Tech.PaymentService.mapper;

import com.Tulip_Tech.PaymentService.entity.PaymentEntity;
import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public PaymentEntity dtoToEntity(CreatePaymentRequest createPaymentRequest) {
        PaymentEntity paymentEntity = new PaymentEntity();
        BeanUtils.copyProperties(createPaymentRequest,paymentEntity);
        return paymentEntity;
    }
}
