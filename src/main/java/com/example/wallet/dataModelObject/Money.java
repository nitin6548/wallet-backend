package com.example.wallet.dataModelObject;


import lombok.*;

import javax.persistence.*;

//getter setter above field
@Entity
@Table(name = "wallet")
@Getter
@Setter
@AllArgsConstructor
public class Money {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "money_id")
    private Integer id;

    private  double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;
    //test behavior of currency where - repo or here
}
