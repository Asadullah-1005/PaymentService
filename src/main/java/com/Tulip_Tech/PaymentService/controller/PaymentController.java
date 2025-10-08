package com.Tulip_Tech.PaymentService.controller;

import com.Tulip_Tech.PaymentService.service.PaymentService;
import com.Tulip_Tech.PaymentService.service.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentServiceImpl paymentServiceImpl;
}
