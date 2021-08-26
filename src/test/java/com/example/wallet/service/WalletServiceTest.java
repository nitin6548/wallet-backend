package com.example.wallet.service;

import com.example.wallet.controller.WalletController;
import com.example.wallet.dataModelObject.Money;
import com.example.wallet.repository.WalletRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.wallet.dataModelObject.Currency.DOLLAR;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@WebMvcTest(WalletService.class)
class WalletServiceTest {

    @Autowired
    private WalletService walletService;

    @MockBean
    private WalletRepository walletRepository;

    @Test
    public void shouldDepositMoneyInWalletWhenDepositMoneyIsCalled(){

        String expectedMoneyRequest =  "{" +
                "\"amount\": 20.00,"+ "\"currency\": \"DOLLAR\""+"}";

        Money expectedMoneyData= Money.builder()
                .amount(20.00)
                .currency(DOLLAR)
                .build();

        when(walletRepository.save(expectedMoneyData)).thenReturn(expectedMoneyData);

        Money actualMoney = walletService.deposit(expectedMoneyData);

        verify(walletRepository).save(expectedMoneyData);
        assertEquals(expectedMoneyData,actualMoney);

    }
}