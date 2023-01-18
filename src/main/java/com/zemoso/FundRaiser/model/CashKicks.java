package com.zemoso.FundRaiser.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "cashkicks")
public class CashKicks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cash_kick_id")
    private Integer cashKickId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    //@Cascade(CascadeType.ALL)
    private User user;

    @Column(name = "created_on")
    private Date date;

    @Column(name = "cashkickname")
    private String cashKickName;

    @ManyToOne(targetEntity = Contract.class)
    private Collection<Contract> contract;

    @OneToMany(targetEntity = PaymentShedule.class)
    private Set<PaymentShedule> paymentShedule;

    public CashKicks(){

    }

    public CashKicks(Integer cashKickId, User user, Date date, String cashKickName /*, Collection<Contract> contract_name*/, Set<PaymentShedule> paymentShedule) {
        this.cashKickId = cashKickId;
        this.user = user;
        this.date = date;
        this.cashKickName = cashKickName;
        //this.contract = contract;
        this.paymentShedule = paymentShedule;
    }

    public Integer getCashKickId() {
        return cashKickId;
    }

    public void setCashKickId(Integer cashKickId) {
        this.cashKickId = cashKickId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCashKickName() {
        return cashKickName;
    }

    public void setCashKickName(String cashKickName) {
        this.cashKickName = cashKickName;
    }

//    public Collection<Contract> getContract() {
//        return contract;
//    }
//
//    public void setContract(Collection<Contract> contract) {
//        this.contract = contract;
//    }

    public Set<PaymentShedule> getPaymentShedule() {
        return paymentShedule;
    }

    public void setPaymentShedule(Set<PaymentShedule> paymentShedule) {
        this.paymentShedule = paymentShedule;
    }

    @Override
    public String toString() {
        return "CashKicks{" +
                "cashKickId=" + cashKickId +
                ", user=" + user +
                ", date=" + date +
                ", cashKickName='" + cashKickName + '\'' +
//                ", contract=" + contract +
                ", paymentShedule=" + paymentShedule +
                '}';
    }
}
