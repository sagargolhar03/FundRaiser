package com.zemoso.FundRaiser.controller;


import com.zemoso.FundRaiser.model.PaymentShedule;
import com.zemoso.FundRaiser.model.PmtSheduleCustom;
import com.zemoso.FundRaiser.service.PaymentSheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentSheduleController {

    @Autowired
    PaymentSheduleService paymentSheduleService;





}
