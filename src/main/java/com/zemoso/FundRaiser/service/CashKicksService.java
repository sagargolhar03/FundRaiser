package com.zemoso.FundRaiser.service;

import com.zemoso.FundRaiser.dao.CashKicksRepository;
import com.zemoso.FundRaiser.model.CashKicks;
import com.zemoso.FundRaiser.model.PaymentShedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CashKicksService {

    @Autowired
    CashKicksRepository cashKicksRepository;

    public void saveCashKicks(CashKicks cashKicks)
    {
        cashKicksRepository.save(cashKicks);
    }

    public Set<PaymentShedule> getListOfPaymentShedule(Integer cashKickId){

        Set<PaymentShedule> listOfPaymentShedule =cashKicksRepository.findById(cashKickId).get().getPaymentShedule();
        return listOfPaymentShedule;

    }


    public Optional<CashKicks> getCashKicks(Integer cashKickId){
        return cashKicksRepository.findById(cashKickId);
    }

    public List<CashKicks> getAllCashKicks(){
        return (List<CashKicks>) cashKicksRepository.findAll();
    }



}
