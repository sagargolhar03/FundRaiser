package com.zemoso.FundRaiser.model;

import javax.persistence.*;

@Entity
@Table(name = "paymentstatus")
public class PaymentStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pmt_status_id")
    private Integer pmt_status_id;

    @Column(name = "payment_status")
    private String payment_status;


    public PaymentStatus(){

    }

    public PaymentStatus(Integer pmt_status_id, String payment_status) {
        this.pmt_status_id = pmt_status_id;
        this.payment_status = payment_status;
    }

    public Integer getPmt_status_id() {
        return pmt_status_id;
    }

    public void setPmt_status_id(Integer pmt_status_id) {
        this.pmt_status_id = pmt_status_id;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }


}
