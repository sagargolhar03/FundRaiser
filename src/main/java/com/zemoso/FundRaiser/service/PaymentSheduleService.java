package com.zemoso.FundRaiser.service;

import com.zemoso.FundRaiser.dao.PaymentSheduleRepository;
import com.zemoso.FundRaiser.model.Contract;
import com.zemoso.FundRaiser.model.PaymentShedule;
import com.zemoso.FundRaiser.model.PmtSheduleCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PaymentSheduleService {


    @Autowired
    PaymentSheduleRepository paymentSheduleRepository;



//    public List<PaymentShedule> getPaymentShedule(Integer cashKickId)
//    {
//        List<PaymentShedule> pmtShedule = new ArrayList<PaymentShedule>();
//        paymentSheduleRepository.findBycashkicks(cashKickId).forEach(pmtshd -> pmtShedule.add(pmtshd));
//        return pmtShedule;
//    }


}

