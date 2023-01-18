package com.zemoso.FundRaiser.dao;

import com.zemoso.FundRaiser.model.PaymentShedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;
import java.util.Optional;

@Repository
public interface PaymentSheduleRepository extends JpaRepository<PaymentShedule, Integer> {


 //   List<PaymentShedule> findBycashkicks(Integer cashKickId);

}
