package com.jpaHibernate.jpademo;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    //@GeneratedValue will automatically generate the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int cardNo;
    @Column(nullable = false,unique = true)
    private String dob;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne
    @JoinColumn
    User user;

    public Card() {
    }

    public Card(int cardNo,  String dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
