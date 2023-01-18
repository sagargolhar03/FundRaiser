package com.zemoso.FundRaiser.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "paymentshedule")
public class PaymentShedule {


    @Id
    @Column(name = "payment_shedule_id")
    private Integer paymentSheduleId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pmt_status_id", referencedColumnName = "pmt_status_id")
    private PaymentStatus paymentStatus;

    @Column(name = "dueDate")
    private Date dueDate;

    @Column(name = "expectedAmt")
    private Double expectedAmt;

    @ManyToOne
    @JoinColumn(name="cash_kick_id", nullable=false)
    private CashKicks cashkicks;

    public PaymentShedule(){

    }

    public PaymentShedule(Integer paymentSheduleId, PaymentStatus paymentStatus, Date dueDate, Double expectedAmt) {
        this.paymentSheduleId = paymentSheduleId;
        this.paymentStatus = paymentStatus;
        this.dueDate = dueDate;
        this.expectedAmt = expectedAmt;

    }

    public Integer getPaymentSheduleId() {
        return paymentSheduleId;
    }

    public void setPaymentSheduleId(Integer paymentSheduleId) {
        this.paymentSheduleId = paymentSheduleId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getExpectedAmt() {
        return expectedAmt;
    }

    public void setExpectedAmt(Double expectedAmt) {
        this.expectedAmt = expectedAmt;
    }



    @Override
    public String toString() {
        return "PaymentShedule{" +
                "paymentSheduleId=" + paymentSheduleId +
                ", paymentStatus=" + paymentStatus +
                ", dueDate=" + dueDate +
                ", expectedAmt=" + expectedAmt +
//                ", cashkicks=" + cashkicks +
                '}';
    }
}
