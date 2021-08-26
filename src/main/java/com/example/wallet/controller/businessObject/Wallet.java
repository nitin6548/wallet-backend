package com.example.wallet.controller.businessObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Wallet {

    private Money totalAmount;

    public void depositAmount(Money money) {
        totalAmount = totalAmount.add(money);
    }
    //add money
    //totalAmount
}
