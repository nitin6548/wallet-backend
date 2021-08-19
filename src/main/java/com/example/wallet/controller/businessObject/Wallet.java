package com.example.wallet.controller.businessObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Wallet {

    private Money amount;

    public void depositAmount(Money money) {
        amount = amount.add(money);
    }
    //add money
    //totalamount
}
