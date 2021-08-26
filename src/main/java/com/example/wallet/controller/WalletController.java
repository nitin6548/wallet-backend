package com.example.wallet.controller;


import com.example.wallet.dataModelObject.Money;
import com.example.wallet.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1")
public class WalletController {

    private final WalletService walletService;

    @PostMapping("/depositAmount")
    public Money depositAmount(@RequestBody Money money){

        Money note = this.walletService.deposit(money);
        return note;

    }
}
