package com.Tulip_Tech.PaymentService.controller;

import com.Tulip_Tech.PaymentService.model.Dto.CreatePaymentRequest;
import com.Tulip_Tech.PaymentService.service.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl paymentServiceImpl;

    @PostMapping("/doPayment")
    public ResponseEntity<?> doPayment(@RequestBody CreatePaymentRequest createPaymentRequest) {
        return new ResponseEntity<>(
                paymentServiceImpl.doPayment(createPaymentRequest), HttpStatus.CREATED
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPayment(@PathVariable Long id) {
        return new ResponseEntity<>(
                paymentServiceImpl.findPaymentByOrderId(id)
                , HttpStatus.OK);
    }

    @GetMapping("/by/{id}")
    public ResponseEntity<?> getPaymentById(@PathVariable Long id) {
        return new ResponseEntity<>(paymentServiceImpl.findById(),HttpStatus.OK);
    }
}
