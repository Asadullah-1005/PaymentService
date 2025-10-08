package com.Tulip_Tech.PaymentService.service;

import com.Tulip_Tech.PaymentService.entity.PaymentEntity;
import com.Tulip_Tech.PaymentService.mapper.PaymentMapper;
import com.Tulip_Tech.PaymentService.model.CreatePaymentRequest;
import com.Tulip_Tech.PaymentService.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;


    @Override
    public Long doPayment(CreatePaymentRequest createPaymentRequest) {

        log.info("Recording Payment Details : {}", createPaymentRequest);

        PaymentEntity paymentEntity = paymentMapper.dtoToEntity(createPaymentRequest);
        paymentEntity.setPaymentDate(Instant.now());
        paymentEntity.setPaymentStatus("SUCCESS");
        paymentRepository.save(paymentEntity);

        log.info("Payment Done with Id : {}", paymentEntity.getId());

        return paymentEntity.getId();

    }
}
