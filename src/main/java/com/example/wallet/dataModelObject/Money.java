package com.example.wallet.dataModelObject;


import lombok.*;

import javax.persistence.*;

//getter setter above field
@Entity
@Table(name = "wallet")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class Money {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private  double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;
    //test behavior of currency where - repo or here
}
