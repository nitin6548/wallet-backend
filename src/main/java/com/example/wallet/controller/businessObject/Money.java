package com.example.wallet.controller.businessObject;

import com.example.wallet.dataModelObject.Currency;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
public class Money {


    private  double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    public Money add(Money money){
        return  new Money(money.amount+this.amount, money.currency);
    }

}