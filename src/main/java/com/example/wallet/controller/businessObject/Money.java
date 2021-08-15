package com.example.wallet.controller.businessObject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Money {

    private  double amount;

    //@Enumerated(Currency.)
    private  String currency;

}