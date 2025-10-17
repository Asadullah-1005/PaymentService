package com.Tulip_Tech.PaymentService.service;

import com.Tulip_Tech.PaymentService.entity.PaymentEntity;
import com.Tulip_Tech.PaymentService.mapper.PaymentMapper;
import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;
import com.Tulip_Tech.PaymentService.model.domain.Payment;
import com.Tulip_Tech.PaymentService.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

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

    @Override
    public Payment findPaymentByOrderId(Long id) {
        log.info("Get Payment Details for Order Id : {}", id);

//        Optional<PaymentEntity> paymentEntity = Optional.ofNullable(paymentRepository.findByOrderId(id));


        PaymentEntity paymentEntity = paymentRepository.findByOrderId(id);
        log.info("Payment Details Found : {}", paymentEntity.getId());
        return paymentMapper.entityToDomain(paymentEntity);
    }

    @Override
    public Payment findById() {

        PaymentEntity p =  paymentRepository.findById(1L).orElse(null);
        log.info("Payment Found : {}", p);
        return paymentMapper.entityToDomain(p);
    }


}
