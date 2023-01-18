package com.zemoso.FundRaiser.controller;

import com.zemoso.FundRaiser.model.CashKicks;
import com.zemoso.FundRaiser.model.PaymentShedule;
import com.zemoso.FundRaiser.service.CashKicksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class CashKicksController {



    @Autowired
    CashKicksService cashKicksService;

    @GetMapping(path = "/paymentshedule/{cashKickId}")
    private ResponseEntity<Set<PaymentShedule>> getAllPaymentShedule(@PathVariable("cashKickId") Integer cashKickId){

        Set<PaymentShedule> retrivedPaymentShedule = cashKicksService.getListOfPaymentShedule(cashKickId);

        if (retrivedPaymentShedule.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(retrivedPaymentShedule, HttpStatus.OK);
    }


    @GetMapping(path = "/getcashkicks")
    private ResponseEntity<List<CashKicks>> getAllCashKicks(){

        List<CashKicks> getAllCashKicks = cashKicksService.getAllCashKicks();


        return new ResponseEntity<>(getAllCashKicks, HttpStatus.OK);
    }

    @GetMapping(path = "/getCashkickjson")
    private ResponseEntity<CashKicks> getCashkickjson(){

        return new ResponseEntity<>(new CashKicks(), HttpStatus.OK);
    }

    @PostMapping(path = "/createcashkick")
    private ResponseEntity<CashKicks> saveCashKick(CashKicks cashKicks){

        cashKicksService.saveCashKicks(cashKicks);
       Optional<CashKicks> cashKicks1 =  cashKicksService.getCashKicks(cashKicks.getCashKickId());

       if(cashKicks1.isPresent()){
           return new ResponseEntity<>(cashKicks1.get(), HttpStatus.OK);
       }

        return new ResponseEntity<CashKicks>(new CashKicks(), HttpStatus.OK);
    }



}
