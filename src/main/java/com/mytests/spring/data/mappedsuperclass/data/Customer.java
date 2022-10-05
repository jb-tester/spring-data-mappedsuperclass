package com.mytests.spring.data.mappedsuperclass.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * *
 * <p>Created by irina on 30.08.2021.</p>
 * <p>Project: spring-data-mappedsuperclass</p>
 * *
 */
@Entity @Table(name = "customer")
public class Customer extends SomeEntity 
{
   private String surname;
   private Card _creditCard;
   private int _age;
   
    
    
    @Basic @Column(name = "last_name")
    public String getLastname() {
        return surname;
    }

    public void setLastname(String surname) {
        this.surname = surname;
    }
    
    @Basic
    public int getAge() {
        return _age;
    }

    public void setAge(int age) {
        this._age = age;
    }

    @ManyToOne
    public Card getCreditCard() {
        return _creditCard;
    }

    public void setCreditCard(Card card) {
        _creditCard = card;
    }
    
}
