package com.zemoso.FundRaiser.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;

@Entity
@Table(name = "contracts")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Integer contract_id;


    @Column(name = "contract_name")
    private String contract_name;


    @Column(name = "paymen_type")
    private String paymentType;


    @Column(name = "per_payment")
    private Double perPayment;


    @Column(name = "term_lenght")
    private Double termLenght;

    @Column(name = "fee")
    private Double fee;


    @Column(name = "payment_amount")
    private Double paymentAmount;


//    @ManyToMany
//    @JoinTable(
//            name = "cash_kicks_contract_mapping",
//            joinColumns = @JoinColumn(
//                    name = "contract_id", referencedColumnName = "contract_id"),
//            inverseJoinColumns = @JoinColumn(
//                    name = "cash_kick_id", referencedColumnName = "cash_kick_id"))

    @OneToMany(targetEntity = CashKicks.class)
    private Collection<CashKicks> cashkicks;




    public Contract(){

    }

    public Contract(Integer contract_id, String contract_name, String paymentType, Double perPayment, Double termLenght, Double fee, Double paymentAmount, Collection<CashKicks> cashkicks) {
        this.contract_id = contract_id;
        this.contract_name = contract_name;
        this.paymentType = paymentType;
        this.perPayment = perPayment;
        this.termLenght = termLenght;
        this.fee = fee;
        this.paymentAmount = paymentAmount;
        this.cashkicks = cashkicks;
    }

    public Integer getContract_id() {
        return contract_id;
    }

    public void setContract_id(Integer contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPerPayment() {
        return perPayment;
    }

    public void setPerPayment(Double perPayment) {
        this.perPayment = perPayment;
    }

    public Double getTermLenght() {
        return termLenght;
    }

    public void setTermLenght(Double termLenght) {
        this.termLenght = termLenght;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Collection<CashKicks> getCashkicks() {
        return cashkicks;
    }

    public void setCashkicks(Collection<CashKicks> cashkicks) {
        this.cashkicks = cashkicks;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contract_id=" + contract_id +
                ", contract_name='" + contract_name + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", perPayment=" + perPayment +
                ", termLenght=" + termLenght +
                ", fee=" + fee +
                ", paymentAmount=" + paymentAmount +
                ", cashkicks=" + cashkicks +
                '}';
    }
}
