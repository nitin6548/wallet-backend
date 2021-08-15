package com.example.wallet.service;

import com.example.wallet.dataModelObject.Money;
//import com.example.wallet.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WalletService {

    //private final WalletRepository walletRepository;

    public Money deposit(Money money) {
        //walletRepository.save(money);
        return money;
    }
}
