package com.zemoso.FundRaiser.controller;

import com.zemoso.FundRaiser.model.Contract;
import com.zemoso.FundRaiser.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {


    @Autowired
    ContractService contractService;

    @GetMapping("/contracts")
    private List<Contract> getAllContract(){
        return contractService.getAllContracts();
    }
}
