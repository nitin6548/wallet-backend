package com.example.wallet.dataModelObject;


import lombok.*;

//import javax.persistence.Entity;
//import javax.persistence.Enumerated;
//import javax.persistence.Table;

//@Entity
//@Table(name = "wallet")
@Getter
@Setter
@AllArgsConstructor
public class Money {

    private  double amount;

    //@Enumerated(Currency.)
    private  String currency;

}
