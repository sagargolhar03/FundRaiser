package com.zemoso.FundRaiser.service;

import com.zemoso.FundRaiser.dao.ContractRepository;
import com.zemoso.FundRaiser.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {


    @Autowired
    ContractRepository contractRepository;


    public List<Contract> getAllContracts()
    {
        List<Contract> contracts = new ArrayList<Contract>();
        contractRepository.findAll().forEach(cntr -> contracts.add(cntr));
        return contracts;
    }
}
